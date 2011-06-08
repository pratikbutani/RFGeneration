package com.rfgeneration;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import com.rfgeneration.objects.GameInfo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.TableRow.LayoutParams;

public class GameInfoActivity extends Activity implements OnClickListener {
	private ProgressDialog m_ProgressDialog = null;
	 private Runnable viewOrders;
	 private GameInfo gameInfo;
	 
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamedetail);
        
        viewOrders = new Runnable(){
		    public void run() {
		        getOrders();
		    }
		};
		Thread thread =  new Thread(null, viewOrders, "MagentoBackground");
		thread.start();
		m_ProgressDialog = ProgressDialog.show(GameInfoActivity.this,    
		      "", "Now loading...", true);
    }

	 private void getOrders(){
        try{
        	gameInfo = GameInfoScraper.getGameInfo(getIntent().getStringExtra("GAMEINFO_RFGID"));
               //Thread.sleep(2000);
            //Log.i("ARRAY", ""+ gameList.size());
          } catch (Exception e) {
            Log.e("BACKGROUND_PROC", e.getMessage());
          }
          runOnUiThread(returnRes);
      }
	 
	 private Runnable returnRes = new Runnable() {
	        public void run() {
	            
	            m_ProgressDialog.dismiss();
	            
	            try {
	    			gameInfo = GameInfoScraper.getGameInfo(getIntent().getStringExtra("GAMEINFO_RFGID"));
	    		} catch (Exception e) { }
	    		
	    		TextView console = (TextView) findViewById(R.id.gameDetailConsole);
	            if (console != null)
	            	console.setText(gameInfo.getConsole());
	            
	            TextView title = (TextView) findViewById(R.id.gameDetailTitle);
	            if(title != null)
	            {
	            	title.setText(gameInfo.getTitle());
	            	if(gameInfo.getVariationTitle() != null)
	               		title.setText(title.getText() + " [" + gameInfo.getVariationTitle() + "]");
	            }
	            
	            TextView alternateTitle = (TextView) findViewById(R.id.gameDetailAlternateTitle);
	            if(alternateTitle != null)
	            	alternateTitle.setText(gameInfo.getAlternateTitle());

	            TextView year = (TextView) findViewById(R.id.gameDetailYear);
	            if(year != null)
	            	year.setText("" + gameInfo.getYear());
	            
	            TextView rfgId = (TextView) findViewById(R.id.gameDetailRFGID);
	            if(rfgId != null)
	            	rfgId.setText(gameInfo.getRFGID());
	            
	            TextView part = (TextView) findViewById(R.id.gameDetailPart);
	            if(part != null)
	            	part.setText(gameInfo.getPartNumber());
	            
	            TextView upc = (TextView) findViewById(R.id.gameDetailUPC);
	            if(upc != null)
	            	upc.setText(gameInfo.getUPC());
	            
	            TextView publisher = (TextView) findViewById(R.id.gameDetailPublisher);
	            if(publisher != null)
	            	publisher.setText(gameInfo.getPublisher());
	            
	            TextView developer = (TextView) findViewById(R.id.gameDetailDeveloper);
	            if(developer != null)
	            	developer.setText(gameInfo.getDeveloper());
	            
	            TextView rating = (TextView) findViewById(R.id.gameDetailRating);
	            if(rating != null)
	            	rating.setText(gameInfo.getRating());
	            
	            TextView genre = (TextView) findViewById(R.id.gameDetailGenre);
	            if(genre != null)
	            	genre.setText(gameInfo.getGenre());
	            
	            TextView subgenre = (TextView) findViewById(R.id.gameDetailSubgenre);
	            if(subgenre != null)
	            	subgenre.setText(gameInfo.getSubGenre());
	            
	            TextView players = (TextView) findViewById(R.id.gameDetailPlayers);
	            if(players != null)
	            	players.setText(gameInfo.getPlayers());
	            
	            TextView controller = (TextView) findViewById(R.id.gameDetailController);
	            if(controller != null)
	            	controller.setText(gameInfo.getControlScheme());
	            
	            TextView mediaFormat = (TextView) findViewById(R.id.gameDetailMediaFormat);
	            if(mediaFormat != null)
	            	mediaFormat.setText(gameInfo.getMediaFormat());
	            
	            ImageView region = (ImageView) findViewById(R.id.gameDetailRegion);
	            if(region != null) {
	            	if(gameInfo.getRegion().indexOf(",") == -1) {
                		region.setImageDrawable(gameInfo.getRegionDrawable(region.getContext()));
                	} else {                       		
                		region.setImageDrawable(gameInfo.getRegionAnimation(region.getContext()));
                	}
	            }
	            
	            LinearLayout ll = (LinearLayout)findViewById(R.id.gameCreditsLayout);
	            
	            for(int i = 0; i < gameInfo.getNameList().size() && i < gameInfo.getCreditList().size(); i++) {
	                TextView name = new TextView(GameInfoActivity.this);
	                name.setText(gameInfo.getNameList().get(i));
	                name.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
	                name.setTextColor(0xffcc0000);
	                name.setLayoutParams(new LayoutParams(
	                		android.view.ViewGroup.LayoutParams.FILL_PARENT,
	                		android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
	                ll.addView(name);
	                
	                TextView credit = new TextView(GameInfoActivity.this);
	                credit.setText(gameInfo.getCreditList().get(i));
	                credit.setTextColor(Color.BLACK);
	                credit.setLayoutParams(new LayoutParams(
	                		android.view.ViewGroup.LayoutParams.FILL_PARENT,
	                		android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
	                credit.setPadding((int)getResources().getDisplayMetrics().density * 10, 0, 0, (int)getResources().getDisplayMetrics().density * 5);
	                ll.addView(credit);
	            }
	            
	            ((TextView)findViewById(R.id.DetailDetail)).setOnClickListener(GameInfoActivity.this);
	            ((TextView)findViewById(R.id.DetailImages)).setOnClickListener(GameInfoActivity.this);
	            ((TextView)findViewById(R.id.DetailCredits)).setOnClickListener(GameInfoActivity.this);
	            
	            try {
	    			setCurrentLayout(findViewById(R.id.DetailDetail));
	    		} catch (Exception e) { }
	        }
	      };

	public void onClick(View v) {
		try {
			setCurrentLayout(v);
		} catch (Exception e) { }
	}
	
	private void setCurrentLayout(View v) throws XmlPullParserException, IOException {
		// Reset everything.
		 Resources           resources  = getResources();
		 XmlResourceParser   parser     = resources.getXml(R.drawable.text_color);
		 ColorStateList      text       = ColorStateList.createFromXml(resources, parser);
		 Drawable text_bg = resources.getDrawable(R.drawable.text_bg_color);
		 int padding = (int)resources.getDisplayMetrics().density * 5;

		 if(!((TextView) findViewById(R.id.DetailDetail)).isClickable()) {
			((TextView) findViewById(R.id.DetailDetail)).setTextColor(text);
			((TextView) findViewById(R.id.DetailDetail)).setBackgroundDrawable(text_bg);
			((TextView) findViewById(R.id.DetailDetail)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailDetail)).setClickable(true);
		 }

		 if(!((TextView) findViewById(R.id.DetailImages)).isClickable()) {
			((TextView) findViewById(R.id.DetailImages)).setTextColor(text);
			((TextView) findViewById(R.id.DetailImages)).setBackgroundDrawable(text_bg);
			((TextView) findViewById(R.id.DetailImages)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailImages)).setClickable(true);
		 }
		
		 if(!((TextView) findViewById(R.id.DetailCredits)).isClickable()) {
			((TextView) findViewById(R.id.DetailCredits)).setTextColor(text);
			((TextView) findViewById(R.id.DetailCredits)).setBackgroundDrawable(text_bg);
			((TextView) findViewById(R.id.DetailCredits)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailCredits)).setClickable(true);
		 }
	
		((LinearLayout) findViewById(R.id.gameDetailLayout)).setVisibility(View.GONE);
		((LinearLayout) findViewById(R.id.gameImagesLayout)).setVisibility(View.GONE);
		((LinearLayout) findViewById(R.id.gameCreditsLayout)).setVisibility(View.GONE);
		
		if(v.getId() == R.id.DetailDetail) {
			((TextView) findViewById(R.id.DetailDetail)).setTextColor(0xffcc0000);
			((TextView) findViewById(R.id.DetailDetail)).setBackgroundColor(0xffeeeeee);
			((TextView) findViewById(R.id.DetailDetail)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailDetail)).setClickable(false);
			((LinearLayout) findViewById(R.id.gameDetailLayout)).setVisibility(View.VISIBLE);
		} else if(v.getId() == R.id.DetailImages) {
			((TextView) findViewById(R.id.DetailImages)).setTextColor(0xffcc0000);
			((TextView) findViewById(R.id.DetailImages)).setBackgroundColor(0xffeeeeee);
			((TextView) findViewById(R.id.DetailImages)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailImages)).setClickable(false);
			((LinearLayout) findViewById(R.id.gameImagesLayout)).setVisibility(View.VISIBLE);
		} else if(v.getId() == R.id.DetailCredits) {
			((TextView) findViewById(R.id.DetailCredits)).setTextColor(0xffcc0000);
			((TextView) findViewById(R.id.DetailCredits)).setBackgroundColor(0xffeeeeee);
			((TextView) findViewById(R.id.DetailCredits)).setPadding(padding, padding, padding, padding);
			((TextView) findViewById(R.id.DetailCredits)).setClickable(false);
			((LinearLayout) findViewById(R.id.gameCreditsLayout)).setVisibility(View.VISIBLE);
		}
	}
}