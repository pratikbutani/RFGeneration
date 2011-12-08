package com.jgrue.rfgeneration.objects;

public class Console {
	private String console;
	private String id;
	
	public void setName(String name) {
		this.console = name;
	}
	public String getName() {
		return console;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String getAbbreviation() {
		if(console.equals("3DO")) return "3DO";
		if(console.equals("Amstrad CPC 464")) return "CPC";
		if(console.equals("APF M1000 / MP1000")) return "APF";
		if(console.equals("Apple II")) return "AII";
		if(console.equals("Apple II / Apple III")) return "AIIe";
		if(console.equals("Atari 2600")) return "2600";
		if(console.equals("Atari 2600 / 2800")) return "2600";
		if(console.equals("Atari 5200")) return "5200";
		if(console.equals("Atari 7800")) return "7800";
		if(console.equals("Atari 8-bit Family")) return "AT8F";
		if(console.equals("Atari Jaguar")) return "Jag";
		if(console.equals("Atari Jaguar CD")) return "JgCD";
		if(console.equals("Atari Jaguar CD")) return "JgCD";
		if(console.equals("Atari Lynx")) return "Lynx";
		if(console.equals("Atari ST / TT / Falcon")) return "AST";
		if(console.equals("Bally Professional Arcade / Astrocade")) return "Astr";
		if(console.equals("Bandai Arcadia")) return "Arcd";
		if(console.equals("Bandai Intellivision")) return "INTV";
		if(console.equals("Bandai Kousokusen")) return "Vec";
		if(console.equals("Bandai Pippin ATMARK / @WORLD")) return "Pip";
		if(console.equals("Bandai Pippin ATMARK")) return "Pip";
		if(console.equals("Bandai Playdia")) return "Pld";
		if(console.equals("Bandai SuFami Turbo")) return "SfTb";
		if(console.equals("Bandai Super Vision 8000")) return "SV8K";
		if(console.equals("Bandai WonderSwan")) return "WS";
		if(console.equals("Bandai WonderSwan Color / SwanCrystal")) return "WSC";
		if(console.equals("BBC Micro")) return "BBC";
		if(console.equals("Betamax / VHS")) return "BVHS";
		if(console.equals("BIT Gamate")) return "Gmte";
		if(console.equals("Black Point System")) return "BPS";
		if(console.equals("Buzztime Home Trivia System")) return "BUZZ";
		if(console.equals("Camerica Aladdin")) return "Aldn";
		if(console.equals("Capcom CPS Changer")) return "CPS";
		if(console.equals("Casio Loopy")) return "CSOLO";
		if(console.equals("Casio PV-1000")) return "CPV";
		if(console.equals("Casio PV-2000")) return "CPV2";
		if(console.equals("CBS ColecoVision")) return "CV";
		if(console.equals("Channel F")) return "ChF";
		if(console.equals("Coleco ADAM")) return "ADAM";
		if(console.equals("Coleco ColecoVision")) return "CV";
		if(console.equals("Coleco Telstar Arcade")) return "Tlst";
		if(console.equals("Commodore 16 / Plus 4 / 116")) return "C16";
		if(console.equals("Commodore 64")) return "C64";
		if(console.equals("Commodore 64 / MAX Machine")) return "C64";
		if(console.equals("Commodore Amiga")) return "Amig";
		if(console.equals("Commodore Amiga CD32")) return "CD32";
		if(console.equals("Commodore Amiga CDTV")) return "CDTV";
		if(console.equals("Commodore VIC-1001")) return "V1001";
		if(console.equals("Commodore VIC-20")) return "VIC";
		if(console.equals("Cougar Boy")) return "CB";
		if(console.equals("Cybiko Classic / Extreme")) return "Cybi";
		if(console.equals("Dragon 32 / 64")) return "D32";
		if(console.equals("DVD")) return "DVD";
		if(console.equals("EACA EG2000 Colour Genie")) return "EG2K";
		if(console.equals("Emerson Arcadia 2001")) return "Arcd";
		if(console.equals("Enterprise 64 / 128")) return "E64";
		if(console.equals("Entex Adventure Vision")) return "AV";
		if(console.equals("Entex Select-A-Game Machine")) return "SaG";
		if(console.equals("EPOCH Cassette Vision")) return "EpCV";
		if(console.equals("EPOCH Game Pocket Computer")) return "EpGP";
		if(console.equals("EPOCH Super Cassette Vision")) return "EpSC";
		if(console.equals("Exidy Sorcerer")) return "Sorc";
		if(console.equals("Fairchild Channel F")) return "ChF";
		if(console.equals("Fisher Price Pixter")) return "Pixter";
		if(console.equals("FM Towns/Marty/Marty 2")) return "FMT";
		if(console.equals("Fujitsu FM-7")) return "FM7";
		if(console.equals("Funtech Super A Can")) return "FSAC";
		if(console.equals("Gakken Compact Vision")) return "GCV";
		if(console.equals("Game & Watch Handhelds")) return "G&W";
		if(console.equals("Game Park GP32")) return "GP32";
		if(console.equals("GCE Vectrex")) return "Vec";
		if(console.equals("GoGo TV Video Vision")) return "GoTV";
		if(console.equals("GrandStand Tutor / Dick Smith Wizzard")) return "Tomy";
		if(console.equals("Hartung GameMaster")) return "GMst";
		if(console.equals("Hasbro Net Jet")) return "NJET";
		if(console.equals("Hyundai Comboy")) return "HCB";
		if(console.equals("Hyundai Super Comboy")) return "HSC";
		if(console.equals("IBM JX")) return "JX";
		if(console.equals("IBM PC")) return "PC";
		if(console.equals("IBM PC Jr.")) return "PCJr";
		if(console.equals("Interton VC 4000")) return "IV4K";
		if(console.equals("Interton Video 2000")) return "IV2K";
		if(console.equals("Jazwares Disney Dream Sketcher")) return "JDDS";
		if(console.equals("LeapFrog Didj")) return "Didj";
		if(console.equals("Leapfrog Fly")) return "Fly";
		if(console.equals("Leapfrog iQuest")) return "Quest";
		if(console.equals("Leapfrog Leapster")) return "Leap";
		if(console.equals("LJN Video Art")) return "VArt";
		if(console.equals("Macintosh")) return "Mac";
		if(console.equals("Magnavox Odyssey")) return "OD";
		if(console.equals("Magnavox Odyssey^2")) return "O2";
		if(console.equals("Magnavox VideoPac")) return "O2";
		if(console.equals("Mattel Aquarius")) return "AQ";
		if(console.equals("Mattel Captain Power")) return "CPwr";
		if(console.equals("Mattel Children's Discovery System")) return "CDS";
		if(console.equals("Mattel Hyperscan")) return "MHYP";
		if(console.equals("Mattel Intellivision")) return "INTV";
		if(console.equals("MegaDuck")) return "DucK";
		if(console.equals("Memorex VIS")) return "VIS";
		if(console.equals("Microsoft Xbox")) return "Xbox";
		if(console.equals("Microsoft Xbox 360")) return "X360";
		if(console.equals("Microsoft Xbox Live Arcade")) return "XBLA";
		if(console.equals("Milton Bradley MicroVision")) return "MV";
		if(console.equals("MPT-02")) return "MPT02";
		if(console.equals("MSX")) return "MSX";
		if(console.equals("MSX / MSX2")) return "MSX";
		if(console.equals("MSX / MSX2 / Zemmix")) return "MSX";
		if(console.equals("Multiple Consoles")) return "MULTI";
		if(console.equals("NEC PC Engine")) return "PCE";
		if(console.equals("NEC PC Engine CD")) return "PCED";
		if(console.equals("NEC PC-6001")) return "PC6001";
		if(console.equals("NEC PC-8001")) return "PC8001";
		if(console.equals("NEC PC-88")) return "PC88";
		if(console.equals("NEC PC-98")) return "PC98";
		if(console.equals("NEC PC-FX")) return "PCFX";
		if(console.equals("NEC SuperGrafx")) return "SGfx";
		if(console.equals("NEC TG-CD")) return "TGCD";
		if(console.equals("NEC Trek")) return "Trek";
		if(console.equals("NEC TurboGrafx-16")) return "TG16";
		if(console.equals("NEC TurboGrafx-CD")) return "TGCD";
		if(console.equals("Nichibutsu My Vision")) return "NMV";
		if(console.equals("Nikko digiBlast")) return "digB";
		if(console.equals("Nintendo 3DS")) return "3DS";
		if(console.equals("Nintendo 64")) return "N64";
		if(console.equals("Nintendo 64DD")) return "64DD";
		if(console.equals("Nintendo DS")) return "DS";
		if(console.equals("Nintendo DSi")) return "DSi";
		if(console.equals("Nintendo DSiWare")) return "DSiW";
		if(console.equals("Nintendo e-Reader")) return "eRdr";
		if(console.equals("Nintendo eShop")) return "eShop";
		if(console.equals("Nintendo Famicom")) return "FC";
		if(console.equals("Nintendo Famicom Disk System")) return "FCD";
		if(console.equals("Nintendo Game Boy")) return "GB";
		if(console.equals("Nintendo Game Boy Advance")) return "GBA";
		if(console.equals("Nintendo Game Boy Color")) return "GBC";
		if(console.equals("Nintendo GameCube")) return "GC";
		if(console.equals("Nintendo iQue")) return "iQue";
		if(console.equals("Nintendo NES")) return "NES";
		if(console.equals("Nintendo Pok�mon Mini")) return "PKMN";
		if(console.equals("Nintendo SNES")) return "SNES";
		if(console.equals("Nintendo Super Famicom")) return "SFC";
		if(console.equals("Nintendo Virtual Boy")) return "VB";
		if(console.equals("Nintendo Virtual Console / WiiWare")) return "NVC";
		if(console.equals("Nintendo Watch & Game")) return "NW&G";
		if(console.equals("Nintendo Wii")) return "Wii";
		if(console.equals("Nokia N-Gage")) return "Nge";
		if(console.equals("Nuon Technology")) return "Nuon";
		if(console.equals("Odyssey")) return "OD";
		if(console.equals("Ohio Arts Etch-A-Sketch Animator 2000")) return "An2K";
		if(console.equals("Olivetti Envision")) return "OVE";
		if(console.equals("Palm OS")) return "PaOS";
		if(console.equals("PC-50X Family")) return "PC50X";
		if(console.equals("Philips CD-i")) return "CD-i";
		if(console.equals("Philips Tele-spiel ES-2201")) return "2201";
		if(console.equals("Philips Videopac")) return "VidP";
		if(console.equals("Pioneer LaserActive")) return "LAct";
		if(console.equals("Plug & Play TV Games")) return "TV";
		if(console.equals("Plug & Play TV Games")) return "PNP";
		if(console.equals("Pong Consoles")) return "Pong";
		if(console.equals("RCA Studio II")) return "StII";
		if(console.equals("RDI Halcyon")) return "Halc";
		if(console.equals("Robotron KC 85")) return "KC85";
		if(console.equals("Robotron KC 87")) return "KC87";
		if(console.equals("Romtec ColorVision")) return "ClrV";
		if(console.equals("Sammy Atomiswave")) return "ATW";
		if(console.equals("Samsung Saturn")) return "Sat";
		if(console.equals("Sears Talking Computron")) return "STC";
		if(console.equals("Sega 32X")) return "32X";
		if(console.equals("Sega CD")) return "SCD";
		if(console.equals("Sega Dreamcast")) return "DC";
		if(console.equals("Sega Game Gear")) return "GG";
		if(console.equals("Sega Genesis")) return "Gen";
		if(console.equals("Sega Genesis / Mega Drive")) return "GEN/MD";
		if(console.equals("Sega Genesis 32X")) return "32X";
		if(console.equals("Sega Master System")) return "SMS";
		if(console.equals("Sega Master System / Mark III")) return "SMS";
		if(console.equals("Sega Mega CD")) return "MCD";
		if(console.equals("Sega Mega Drive")) return "MD";
		if(console.equals("Sega Mega Drive 32X")) return "32X";
		if(console.equals("Sega Pico")) return "Pico";
		if(console.equals("Sega Saturn")) return "Sat";
		if(console.equals("Sega SC-3000 / SF-7000")) return "SSG";
		if(console.equals("Sega SG-1000")) return "SSG";
		if(console.equals("Sega SG-1000 / SC-3000 / SF-7000")) return "SSG";
		if(console.equals("Sega SG-1000 / SC-3000 / SF-7000")) return "SSG";
		if(console.equals("Sega Super 32X")) return "32X";
		if(console.equals("Sharp MZ Family")) return "SMZ";
		if(console.equals("Sharp X1")) return "X1";
		if(console.equals("Sharp X68000")) return "X68k";
		if(console.equals("Sinclair ZX Spectrum")) return "SZX";
		if(console.equals("Sinclair Spectrum ZX")) return "SZX";
		if(console.equals("Sinclair ZX80 / ZX81")) return "ZX81";
		if(console.equals("SNK Hyper Neo Geo 64")) return "HNG";
		if(console.equals("SNK Neo Geo AES")) return "AES";
		if(console.equals("SNK Neo Geo CD")) return "NGCD";
		if(console.equals("SNK Neo Geo MVS")) return "MVS";
		if(console.equals("SNK Neo Geo Pocket")) return "NGP";
		if(console.equals("SNK Neo Geo Pocket Color")) return "NGPC";
		if(console.equals("Sony Playstation")) return "PSX";
		if(console.equals("Sony PlayStation")) return "PSX";
		if(console.equals("Sony PlayStation 2")) return "PS2";
		if(console.equals("Sony PlayStation 3")) return "PS3";
		if(console.equals("Sony PlayStation Network")) return "PSN";
		if(console.equals("Sony PSP")) return "PSP";
		if(console.equals("Stand-Alone Handhelds")) return "Hand";
		if(console.equals("Starpath Supercharger")) return "SSC";
		if(console.equals("Taito Cybercore System")) return "TCC";
		if(console.equals("Taito F3 System")) return "F3";
		if(console.equals("Tandy TRS-80 / Color Computer")) return "TRS";
		if(console.equals("Tapwave Zodiac")) return "Zod";
		if(console.equals("Tec Toy Zeebo")) return "TTZ";
		if(console.equals("Texas Instruments TI-99/4A")) return "TI99";
		if(console.equals("Tiger Game.com")) return "Gcom";
		if(console.equals("Tiger Gizmondo")) return "Giz";
		if(console.equals("Tiger Handhelds")) return "TigH";
		if(console.equals("Tiger R-Zone")) return "RZn";
		if(console.equals("TimeTop GameKing I / II / III")) return "GK";
		if(console.equals("Timex Sinclair 1000")) return "TS1000";
		if(console.equals("Timex Sinclair 2068")) return "TS2068";
		if(console.equals("Tomy Pyuuta / Pyuuta Jr")) return "Tomy";
		if(console.equals("Tomy Tutor")) return "Tomy";
		if(console.equals("Toshiba Visicom")) return "StII";
		if(console.equals("Toymax Arcadia II")) return "ArcaII";
		if(console.equals("VideoBrain Family Computer")) return "VBrn";
		if(console.equals("View-Master Interactive Vision")) return "VMIV";
		if(console.equals("VTech CreatiVision")) return "VTCV";
		if(console.equals("VTech Learning Pad, The")) return "Learning Pad";
		if(console.equals("VTech Socrates")) return "Soc";
		if(console.equals("VTech V.Flash")) return "V.Flash";
		if(console.equals("VTech V.Smile")) return "SMIL";
		if(console.equals("VTech V.Smile Baby")) return "VVSB";
		if(console.equals("Watara SuperVision")) return "SV";
		if(console.equals("Worlds of Wonder Action Max")) return "AMax";
		if(console.equals("XaviX XaviXPORT")) return "Xav";
		if(console.equals("YENO Prof. Weiss-Alles")) return "W-A";
		if(console.equals("Yeno Super Cassette Vision")) return "YnSC";
		if(console.equals("ZAPiT Game Wave")) return "ZGW";
		
		return "???";
	}
}