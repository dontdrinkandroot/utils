/**
 * Copyright (C) 2012 Philip W. Sorst <philip@sorst.net>
 * and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dontdrinkandroot.utils;

import javax.xml.bind.annotation.XmlEnumValue;


/**
 * This enumeration implements the following standard:
 * <p>
 * ISO 639-1:2002, Codes for the representation of names of languages - Part 1: Alpha-2 code, is the first part of the
 * ISO 639 series of international standards for language codes. Part 1 covers the registration of two-letter codes.
 * There are 136 two-letter codes registered. The registered codes cover the world's major languages.
 * 
 * These codes are a useful international, and formal, shorthand for indicating languages. (Source: <a
 * href="http://en.wikipedia.org/wiki/ISO_639-1">Wikipedia</a>)
 * <p>
 * <a href="http://www.loc.gov/standards/iso639-2/php/English_list.php"> Offical list </a>
 * <p>
 * It is annotated with {@link XmlEnumValue}s, so it can be de-/serialized using jaxb.
 * 
 * @author Philip Sorst
 * 
 */
public enum ISO_639_1 {

	/** Afar. */
	@XmlEnumValue("aa")
	AA("Afar"),

	/** Abkhazian. */
	@XmlEnumValue("ab")
	AB("Abkhazian"),

	/** Afrikaans. */
	@XmlEnumValue("af")
	AF("Afrikaans"),

	/** Akan. */
	@XmlEnumValue("ak")
	AK("Akan"),

	/** Albanian. */
	@XmlEnumValue("sq")
	SQ("Albanian"),

	/** Amharic. */
	@XmlEnumValue("am")
	AM("Amharic"),

	/** Arabic. */
	@XmlEnumValue("ar")
	AR("Arabic"),

	/** Aragonese. */
	@XmlEnumValue("an")
	AN("Aragonese"),

	/** Armenian. */
	@XmlEnumValue("hy")
	HY("Armenian"),

	/** Assamese. */
	@XmlEnumValue("as")
	AS("Assamese"),

	/** Avaric. */
	@XmlEnumValue("av")
	AV("Avaric"),

	/** Avestan. */
	@XmlEnumValue("ae")
	AE("Avestan"),

	/** Aymara. */
	@XmlEnumValue("ay")
	AY("Aymara"),

	/** Azerbaijani. */
	@XmlEnumValue("az")
	AZ("Azerbaijani"),

	/** Bashkir. */
	@XmlEnumValue("ba")
	BA("Bashkir"),

	/** Bambara. */
	@XmlEnumValue("bm")
	BM("Bambara"),

	/** Basque. */
	@XmlEnumValue("eu")
	EU("Basque"),

	/** Belarusian. */
	@XmlEnumValue("be")
	BE("Belarusian"),

	/** Bengali. */
	@XmlEnumValue("bn")
	BN("Bengali"),

	/** Bihari languages. */
	@XmlEnumValue("bh")
	BH("Bihari languages"),

	/** Bislama. */
	@XmlEnumValue("bi")
	BI("Bislama"),

	/** Bosnian. */
	@XmlEnumValue("bs")
	BS("Bosnian"),

	/** Breton. */
	@XmlEnumValue("br")
	BR("Breton"),

	/** Bulgarian. */
	@XmlEnumValue("bg")
	BG("Bulgarian"),

	/** Burmese. */
	@XmlEnumValue("my")
	MY("Burmese"),

	/** Catalan; Valencian. */
	@XmlEnumValue("ca")
	CA("Catalan; Valencian"),

	/** Chamorro. */
	@XmlEnumValue("ch")
	CH("Chamorro"),

	/** Chechen. */
	@XmlEnumValue("ce")
	CE("Chechen"),

	/** Chinese. */
	@XmlEnumValue("zh")
	ZH("Chinese"),

	/** Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic. */
	@XmlEnumValue("cu")
	CU("Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian;" + "Old Church Slavonic"),

	/** Chuvash. */
	@XmlEnumValue("cv")
	CV("Chuvash"),

	/** Cornish. */
	@XmlEnumValue("kw")
	KW("Cornish"),

	/** Corsican. */
	@XmlEnumValue("co")
	CO("Corsican"),

	/** Cree. */
	@XmlEnumValue("cr")
	CR("Cree"),

	/** Czech. */
	@XmlEnumValue("cs")
	CS("Czech"),

	/** Danish. */
	@XmlEnumValue("da")
	DA("Danish"),

	/** Divehi; Dhivehi; Maldivian. */
	@XmlEnumValue("dv")
	DV("Divehi; Dhivehi; Maldivian"),

	/** Dutch; Flemish. */
	@XmlEnumValue("nl")
	NL("Dutch; Flemish"),

	/** Dzongkha. */
	@XmlEnumValue("dz")
	DZ("Dzongkha"),

	/** English. */
	@XmlEnumValue("en")
	EN("English"),

	/** Esperanto. */
	@XmlEnumValue("eo")
	EO("Esperanto"),

	/** Estonian. */
	@XmlEnumValue("et")
	ET("Estonian"),

	/** Ewe. */
	@XmlEnumValue("ee")
	EE("Ewe"),

	/** Faroese. */
	@XmlEnumValue("fo")
	FO("Faroese"),

	/** Fijian. */
	@XmlEnumValue("fj")
	FJ("Fijian"),

	/** Finnish. */
	@XmlEnumValue("fi")
	FI("Finnish"),

	/** French. */
	@XmlEnumValue("fr")
	FR("French"),

	/** Western Frisian. */
	@XmlEnumValue("fy")
	FY("Western Frisian"),

	/** Fulah. */
	@XmlEnumValue("ff")
	FF("Fulah"),

	/** Georgian. */
	@XmlEnumValue("ka")
	KA("Georgian"),

	/** German. */
	@XmlEnumValue("de")
	DE("German"),

	/** Gaelic; Scottish Gaelic. */
	@XmlEnumValue("gd")
	GD("Gaelic; Scottish Gaelic"),

	/** Irish. */
	@XmlEnumValue("ga")
	GA("Irish"),

	/** Galician. */
	@XmlEnumValue("gl")
	GL("Galician"),

	/** Manx. */
	@XmlEnumValue("gv")
	GV("Manx"),

	/** Greek, Modern (1453-). */
	@XmlEnumValue("el")
	EL("Greek, Modern (1453-)"),

	/** Guarani. */
	@XmlEnumValue("gn")
	GN("Guarani"),

	/** Gujarati. */
	@XmlEnumValue("gu")
	GU("Gujarati"),

	/** Haitian; Haitian Creole. */
	@XmlEnumValue("ht")
	HT("Haitian; Haitian Creole"),

	/** Hausa. */
	@XmlEnumValue("ha")
	HA("Hausa"),

	/** Hebrew. */
	@XmlEnumValue("he")
	HE("Hebrew"),

	/** Herero. */
	@XmlEnumValue("hz")
	HZ("Herero"),

	/** Hindi. */
	@XmlEnumValue("hi")
	HI("Hindi"),

	/** Hiri Motu. */
	@XmlEnumValue("ho")
	HO("Hiri Motu"),

	/** Croatian. */
	@XmlEnumValue("hr")
	HR("Croatian"),

	/** Hungarian. */
	@XmlEnumValue("hu")
	HU("Hungarian"),

	/** Igbo. */
	@XmlEnumValue("ig")
	IG("Igbo"),

	/** Icelandic. */
	@XmlEnumValue("is")
	IS("Icelandic"),

	/** Ido. */
	@XmlEnumValue("io")
	IO("Ido"),

	/** Sichuan Yi; Nuosu. */
	@XmlEnumValue("ii")
	II("Sichuan Yi; Nuosu"),

	/** Inuktitut. */
	@XmlEnumValue("iu")
	IU("Inuktitut"),

	/** Interlingue; Occidental. */
	@XmlEnumValue("ie")
	IE("Interlingue; Occidental"),

	/** Interlingua (International Auxiliary Language Association). */
	@XmlEnumValue("ia")
	IA("Interlingua (International Auxiliary Language Association)"),

	/** Indonesian. */
	@XmlEnumValue("id")
	ID("Indonesian"),

	/** Inupiaq. */
	@XmlEnumValue("ik")
	IK("Inupiaq"),

	/** Italian. */
	@XmlEnumValue("it")
	IT("Italian"),

	/** Javanese. */
	@XmlEnumValue("jv")
	JV("Javanese"),

	/** Japanese. */
	@XmlEnumValue("ja")
	JA("Japanese"),

	/** Kalaallisut; Greenlandic. */
	@XmlEnumValue("kl")
	KL("Kalaallisut; Greenlandic"),

	/** Kannada. */
	@XmlEnumValue("kn")
	KN("Kannada"),

	/** Kashmiri. */
	@XmlEnumValue("ks")
	KS("Kashmiri"),

	/** Kanuri. */
	@XmlEnumValue("kr")
	KR("Kanuri"),

	/** Kazakh. */
	@XmlEnumValue("kk")
	KK("Kazakh"),

	/** Central Khmer. */
	@XmlEnumValue("km")
	KM("Central Khmer"),

	/** Kikuyu; Gikuyu. */
	@XmlEnumValue("ki")
	KI("Kikuyu; Gikuyu"),

	/** Kinyarwanda. */
	@XmlEnumValue("rw")
	RW("Kinyarwanda"),

	/** Kirghiz; Kyrgyz. */
	@XmlEnumValue("ky")
	KY("Kirghiz; Kyrgyz"),

	/** Komi. */
	@XmlEnumValue("kv")
	KV("Komi"),

	/** Kongo. */
	@XmlEnumValue("kg")
	KG("Kongo"),

	/** Korean. */
	@XmlEnumValue("ko")
	KO("Korean"),

	/** Kuanyama; Kwanyama. */
	@XmlEnumValue("kj")
	KJ("Kuanyama; Kwanyama"),

	/** Kurdish. */
	@XmlEnumValue("ku")
	KU("Kurdish"),

	/** Lao. */
	@XmlEnumValue("lo")
	LO("Lao"),

	/** Latin. */
	@XmlEnumValue("la")
	LA("Latin"),

	/** Latvian. */
	@XmlEnumValue("lv")
	LV("Latvian"),

	/** Limburgan; Limburger; Limburgish. */
	@XmlEnumValue("li")
	LI("Limburgan; Limburger; Limburgish"),

	/** Lingala. */
	@XmlEnumValue("ln")
	LN("Lingala"),

	/** Lithuanian. */
	@XmlEnumValue("lt")
	LT("Lithuanian"),

	/** Luxembourgish; Letzeburgesch. */
	@XmlEnumValue("lb")
	LB("Luxembourgish; Letzeburgesch"),

	/** Luba-Katanga. */
	@XmlEnumValue("lu")
	LU("Luba-Katanga"),

	/** Ganda. */
	@XmlEnumValue("lg")
	LG("Ganda"),

	/** Macedonian. */
	@XmlEnumValue("mk")
	MK("Macedonian"),

	/** Marshallese. */
	@XmlEnumValue("mh")
	MH("Marshallese"),

	/** Malayalam. */
	@XmlEnumValue("ml")
	ML("Malayalam"),

	/** Maori. */
	@XmlEnumValue("mi")
	MI("Maori"),

	/** Marathi. */
	@XmlEnumValue("mr")
	MR("Marathi"),

	/** Malay. */
	@XmlEnumValue("ms")
	MS("Malay"),

	/** Malagasy. */
	@XmlEnumValue("mg")
	MG("Malagasy"),

	/** Maltese. */
	@XmlEnumValue("mt")
	MT("Maltese"),

	/** Mongolian. */
	@XmlEnumValue("mn")
	MN("Mongolian"),

	/** Nauru. */
	@XmlEnumValue("na")
	NA("Nauru"),

	/** Navajo; Navaho. */
	@XmlEnumValue("nv")
	NV("Navajo; Navaho"),

	/** Ndebele, South; South Ndebele. */
	@XmlEnumValue("nr")
	NR("Ndebele, South; South Ndebele"),

	/** Ndebele, North; North Ndebele. */
	@XmlEnumValue("nd")
	ND("Ndebele, North; North Ndebele"),

	/** Ndonga. */
	@XmlEnumValue("ng")
	NG("Ndonga"),

	/** Nepali. */
	@XmlEnumValue("ne")
	NE("Nepali"),

	/** Norwegian Nynorsk; Nynorsk, Norwegian. */
	@XmlEnumValue("nn")
	NN("Norwegian Nynorsk; Nynorsk, Norwegian"),

	/** Bokmål, Norwegian; Norwegian Bokmål. */
	@XmlEnumValue("nb")
	NB("Bokmål, Norwegian; Norwegian Bokmål"),

	/** Norwegian. */
	@XmlEnumValue("no")
	NO("Norwegian"),

	/** Chichewa; Chewa; Nyanja. */
	@XmlEnumValue("ny")
	NY("Chichewa; Chewa; Nyanja"),

	/** Occitan (post 1500); Provençal. */
	@XmlEnumValue("oc")
	OC("Occitan (post 1500); Provençal"),

	/** Ojibwa. */
	@XmlEnumValue("oj")
	OJ("Ojibwa"),

	/** Oriya. */
	@XmlEnumValue("or")
	OR("Oriya"),

	/** Oromo. */
	@XmlEnumValue("om")
	OM("Oromo"),

	/** Ossetian; Ossetic. */
	@XmlEnumValue("os")
	OS("Ossetian; Ossetic"),

	/** Panjabi; Punjabi. */
	@XmlEnumValue("pa")
	PA("Panjabi; Punjabi"),

	/** Persian. */
	@XmlEnumValue("fa")
	FA("Persian"),

	/** Pali. */
	@XmlEnumValue("pi")
	PI("Pali"),

	/** Polish. */
	@XmlEnumValue("pl")
	PL("Polish"),

	/** Portuguese. */
	@XmlEnumValue("pt")
	PT("Portuguese"),

	/** Pushto; Pashto. */
	@XmlEnumValue("ps")
	PS("Pushto; Pashto"),

	/** Quechua. */
	@XmlEnumValue("qu")
	QU("Quechua"),

	/** Romansh. */
	@XmlEnumValue("rm")
	RM("Romansh"),

	/** Romanian; Moldavian; Moldovan. */
	@XmlEnumValue("ro")
	RO("Romanian; Moldavian; Moldovan"),

	/** Rundi. */
	@XmlEnumValue("rn")
	RN("Rundi"),

	/** Russian. */
	@XmlEnumValue("ru")
	RU("Russian"),

	/** Sango. */
	@XmlEnumValue("sg")
	SG("Sango"),

	/** Sanskrit. */
	@XmlEnumValue("sa")
	SA("Sanskrit"),

	/** Sinhala; Sinhalese. */
	@XmlEnumValue("si")
	SI("Sinhala; Sinhalese"),

	/** Slovak. */
	@XmlEnumValue("sk")
	SK("Slovak"),

	/** Slovenian. */
	@XmlEnumValue("sl")
	SL("Slovenian"),

	/** Northern Sami. */
	@XmlEnumValue("se")
	SE("Northern Sami"),

	/** Samoan. */
	@XmlEnumValue("sm")
	SM("Samoan"),

	/** Shona. */
	@XmlEnumValue("sn")
	SN("Shona"),

	/** Sindhi. */
	@XmlEnumValue("sd")
	SD("Sindhi"),

	/** Somali. */
	@XmlEnumValue("so")
	SO("Somali"),

	/** Sotho, Southern. */
	@XmlEnumValue("st")
	ST("Sotho, Southern"),

	/** Spanish; Castilian. */
	@XmlEnumValue("es")
	ES("Spanish; Castilian"),

	/** Sardinian. */
	@XmlEnumValue("sc")
	SC("Sardinian"),

	/** Serbian. */
	@XmlEnumValue("sr")
	SR("Serbian"),

	/** Swati. */
	@XmlEnumValue("ss")
	SS("Swati"),

	/** Sundanese. */
	@XmlEnumValue("su")
	SU("Sundanese"),

	/** Swahili. */
	@XmlEnumValue("sw")
	SW("Swahili"),

	/** Swedish. */
	@XmlEnumValue("sv")
	SV("Swedish"),

	/** Tahitian. */
	@XmlEnumValue("ty")
	TY("Tahitian"),

	/** Tamil. */
	@XmlEnumValue("ta")
	TA("Tamil"),

	/** Tatar. */
	@XmlEnumValue("tt")
	TT("Tatar"),

	/** Telugu. */
	@XmlEnumValue("te")
	TE("Telugu"),

	/** Tajik. */
	@XmlEnumValue("tg")
	TG("Tajik"),

	/** Tagalog. */
	@XmlEnumValue("tl")
	TL("Tagalog"),

	/** Thai. */
	@XmlEnumValue("th")
	TH("Thai"),

	/** Tibetan. */
	@XmlEnumValue("bo")
	BO("Tibetan"),

	/** Tigrinya. */
	@XmlEnumValue("ti")
	TI("Tigrinya"),

	/** Tonga (Tonga Islands). */
	@XmlEnumValue("to")
	TO("Tonga (Tonga Islands)"),

	/** Tswana. */
	@XmlEnumValue("tn")
	TN("Tswana"),

	/** Tsonga. */
	@XmlEnumValue("ts")
	TS("Tsonga"),

	/** Turkmen. */
	@XmlEnumValue("tk")
	TK("Turkmen"),

	/** Turkish. */
	@XmlEnumValue("tr")
	TR("Turkish"),

	/** Twi. */
	@XmlEnumValue("tw")
	TW("Twi"),

	/** Uighur; Uyghur. */
	@XmlEnumValue("ug")
	UG("Uighur; Uyghur"),

	/** Ukrainian. */
	@XmlEnumValue("uk")
	UK("Ukrainian"),

	/** Urdu. */
	@XmlEnumValue("ur")
	UR("Urdu"),

	/** Uzbek. */
	@XmlEnumValue("uz")
	UZ("Uzbek"),

	/** Venda. */
	@XmlEnumValue("ve")
	VE("Venda"),

	/** Vietnamese. */
	@XmlEnumValue("vi")
	VI("Vietnamese"),

	/** Volapük. */
	@XmlEnumValue("vo")
	VO("Volapük"),

	/** Welsh. */
	@XmlEnumValue("cy")
	CY("Welsh"),

	/** Walloon. */
	@XmlEnumValue("wa")
	WA("Walloon"),

	/** Wolof. */
	@XmlEnumValue("wo")
	WO("Wolof"),

	/** Xhosa. */
	@XmlEnumValue("xh")
	XH("Xhosa"),

	/** Yiddish. */
	@XmlEnumValue("yi")
	YI("Yiddish"),

	/** Yoruba. */
	@XmlEnumValue("yo")
	YO("Yoruba"),

	/** Zhuang; Chuang. */
	@XmlEnumValue("za")
	ZA("Zhuang; Chuang"),

	/** Zulu. */
	@XmlEnumValue("zu")
	ZU("Zulu");

	/** The country name. */
	private String name;


	/**
	 * Default constructor.
	 * 
	 * @param name
	 *            The country name
	 */
	private ISO_639_1(final String name) {

		this.name = name;
	}


	/**
	 * Retrieve the country name.
	 * 
	 * @return The country name
	 */
	public String getName() {

		return this.name;
	}


	@Override
	public String toString() {

		return super.toString().toLowerCase();
	}
}
