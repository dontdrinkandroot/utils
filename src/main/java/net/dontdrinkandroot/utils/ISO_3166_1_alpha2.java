/*
 * Copyright (C) 2012-2017 Philip W. Sorst <philip@sorst.net>
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
 * ISO 3166-1 alpha-2 codes are two-letter country codes defined in ISO 3166-1, part of the ISO 3166 standard published
 * by the International Organization for Standardization (ISO), to represent countries, dependent territories, and
 * special areas of geographical interest. They are the most widely used of the country codes published by ISO (the
 * others being alpha-3 and numeric), and are used most prominently for the Internet's country code top-level domains
 * (with a few exceptions). They were first included as part of the ISO 3166 standard in its first edition in 1974.
 * (Source: <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">Wikipedia</a>)
 * <p>
 * <a href= "http://www.iso.org/iso/country_codes/iso_3166_code_lists/english_country_names_and_code_elements.htm" >
 * Official List </a>
 * <p>
 * It is annotated with {@link XmlEnumValue}s, so it can be de-/serialized using jaxb.
 *
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public enum ISO_3166_1_alpha2
{
    /**
     * Afghanistan.
     */
    @XmlEnumValue("AF")
    AF("Afghanistan"),

    /**
     * Åland Islands.
     */
    @XmlEnumValue("AX")
    AX("Åland Islands"),

    /**
     * Albania.
     */
    @XmlEnumValue("AL")
    AL("Albania"),

    /**
     * Algeria.
     */
    @XmlEnumValue("DZ")
    DZ("Algeria"),

    /**
     * American Samoa.
     */
    @XmlEnumValue("AS")
    AS("American Samoa"),

    /**
     * Andorra.
     */
    @XmlEnumValue("AD")
    AD("Andorra"),

    /**
     * Angola.
     */
    @XmlEnumValue("AO")
    AO("Angola"),

    /**
     * Anguilla.
     */
    @XmlEnumValue("AI")
    AI("Anguilla"),

    /**
     * Antarctica.
     */
    @XmlEnumValue("AQ")
    AQ("Antarctica"),

    /**
     * Antigua and Barbuda.
     */
    @XmlEnumValue("AG")
    AG("Antigua and Barbuda"),

    /**
     * Argentina.
     */
    @XmlEnumValue("AR")
    AR("Argentina"),

    /**
     * Armenia.
     */
    @XmlEnumValue("AM")
    AM("Armenia"),

    /**
     * Aruba.
     */
    @XmlEnumValue("AW")
    AW("Aruba"),

    /**
     * Australia.
     */
    @XmlEnumValue("AU")
    AU("Australia"),

    /**
     * Austria.
     */
    @XmlEnumValue("AT")
    AT("Austria"),

    /**
     * Azerbaijan.
     */
    @XmlEnumValue("AZ")
    AZ("Azerbaijan"),

    /**
     * Bahamas.
     */
    @XmlEnumValue("BS")
    BS("Bahamas"),

    /**
     * Bahrain.
     */
    @XmlEnumValue("BH")
    BH("Bahrain"),

    /**
     * Bangladesh.
     */
    @XmlEnumValue("BD")
    BD("Bangladesh"),

    /**
     * Barbados.
     */
    @XmlEnumValue("BB")
    BB("Barbados"),

    /**
     * Belarus.
     */
    @XmlEnumValue("BY")
    BY("Belarus"),

    /**
     * Belgium.
     */
    @XmlEnumValue("BE")
    BE("Belgium"),

    /**
     * Belize.
     */
    @XmlEnumValue("BZ")
    BZ("Belize"),

    /**
     * Benin.
     */
    @XmlEnumValue("BJ")
    BJ("Benin"),

    /**
     * Bermuda.
     */
    @XmlEnumValue("BM")
    BM("Bermuda"),

    /**
     * Bhutan.
     */
    @XmlEnumValue("BT")
    BT("Bhutan"),

    /**
     * Bolivia, Plurinational State of.
     */
    @XmlEnumValue("BO")
    BO("Bolivia, Plurinational State of"),

    /**
     * Bosnia and Herzegovina.
     */
    @XmlEnumValue("BA")
    BA("Bosnia and Herzegovina"),

    /**
     * Botswana.
     */
    @XmlEnumValue("BW")
    BW("Botswana"),

    /**
     * Bouvet Island.
     */
    @XmlEnumValue("BV")
    BV("Bouvet Island"),

    /**
     * Brazil.
     */
    @XmlEnumValue("BR")
    BR("Brazil"),

    /**
     * British Indian Ocean Territory.
     */
    @XmlEnumValue("IO")
    IO("British Indian Ocean Territory"),

    /**
     * Brunei Darussalam.
     */
    @XmlEnumValue("BN")
    BN("Brunei Darussalam"),

    /**
     * Bulgaria.
     */
    @XmlEnumValue("BG")
    BG("Bulgaria"),

    /**
     * Burkina Faso.
     */
    @XmlEnumValue("BF")
    BF("Burkina Faso"),

    /**
     * Burundi.
     */
    @XmlEnumValue("BI")
    BI("Burundi"),

    /**
     * Cambodia.
     */
    @XmlEnumValue("KH")
    KH("Cambodia"),

    /**
     * Cameroon.
     */
    @XmlEnumValue("CM")
    CM("Cameroon"),

    /**
     * Canada.
     */
    @XmlEnumValue("CA")
    CA("Canada"),

    /**
     * Cape Verde.
     */
    @XmlEnumValue("CV")
    CV("Cape Verde"),

    /**
     * Cayman Islands.
     */
    @XmlEnumValue("KY")
    KY("Cayman Islands"),

    /**
     * Central African Republic.
     */
    @XmlEnumValue("CF")
    CF("Central African Republic"),

    /**
     * Chad.
     */
    @XmlEnumValue("TD")
    TD("Chad"),

    /**
     * Chile.
     */
    @XmlEnumValue("CL")
    CL("Chile"),

    /**
     * China.
     */
    @XmlEnumValue("CN")
    CN("China"),

    /**
     * Christmas Island.
     */
    @XmlEnumValue("CX")
    CX("Christmas Island"),

    /**
     * Cocos (Keeling) Islands.
     */
    @XmlEnumValue("CC")
    CC("Cocos (Keeling) Islands"),

    /**
     * Colombia.
     */
    @XmlEnumValue("CO")
    CO("Colombia"),

    /**
     * Comoros.
     */
    @XmlEnumValue("KM")
    KM("Comoros"),

    /**
     * Congo.
     */
    @XmlEnumValue("CG")
    CG("Congo"),

    /**
     * Congo, The Democratic Republic of the.
     */
    @XmlEnumValue("CD")
    CD("Congo, The Democratic Republic of the"),

    /**
     * Cook Islands.
     */
    @XmlEnumValue("CK")
    CK("Cook Islands"),

    /**
     * Costa Rica.
     */
    @XmlEnumValue("CR")
    CR("Costa Rica"),

    /**
     * Côte d'Ivoire.
     */
    @XmlEnumValue("CI")
    CI("Côte d'Ivoire"),

    /**
     * Croatia.
     */
    @XmlEnumValue("HR")
    HR("Croatia"),

    /**
     * Cuba.
     */
    @XmlEnumValue("CU")
    CU("Cuba"),

    /**
     * Cyprus.
     */
    @XmlEnumValue("CY")
    CY("Cyprus"),

    /**
     * Czech Republic.
     */
    @XmlEnumValue("CZ")
    CZ("Czech Republic"),

    /**
     * Denmark.
     */
    @XmlEnumValue("DK")
    DK("Denmark"),

    /**
     * Djibouti.
     */
    @XmlEnumValue("DJ")
    DJ("Djibouti"),

    /**
     * Dominica.
     */
    @XmlEnumValue("DM")
    DM("Dominica"),

    /**
     * Dominican Republic.
     */
    @XmlEnumValue("DO")
    DO("Dominican Republic"),

    /**
     * Ecuador.
     */
    @XmlEnumValue("EC")
    EC("Ecuador"),

    /**
     * Egypt.
     */
    @XmlEnumValue("EG")
    EG("Egypt"),

    /**
     * El Salvador.
     */
    @XmlEnumValue("SV")
    SV("El Salvador"),

    /**
     * Equatorial Guinea.
     */
    @XmlEnumValue("GQ")
    GQ("Equatorial Guinea"),

    /**
     * Eritrea.
     */
    @XmlEnumValue("ER")
    ER("Eritrea"),

    /**
     * Estonia.
     */
    @XmlEnumValue("EE")
    EE("Estonia"),

    /**
     * Ethiopia.
     */
    @XmlEnumValue("ET")
    ET("Ethiopia"),

    /**
     * Falkland Islands (Malvinas).
     */
    @XmlEnumValue("FK")
    FK("Falkland Islands (Malvinas)"),

    /**
     * Faroe Islands.
     */
    @XmlEnumValue("FO")
    FO("Faroe Islands"),

    /**
     * Fiji.
     */
    @XmlEnumValue("FJ")
    FJ("Fiji"),

    /**
     * Finland.
     */
    @XmlEnumValue("FI")
    FI("Finland"),

    /**
     * France.
     */
    @XmlEnumValue("FR")
    FR("France"),

    /**
     * French Guiana.
     */
    @XmlEnumValue("GF")
    GF("French Guiana"),

    /**
     * French Polynesia.
     */
    @XmlEnumValue("PF")
    PF("French Polynesia"),

    /**
     * French Southern Territories.
     */
    @XmlEnumValue("TF")
    TF("French Southern Territories"),

    /**
     * Gabon.
     */
    @XmlEnumValue("GA")
    GA("Gabon"),

    /**
     * Gambia.
     */
    @XmlEnumValue("GM")
    GM("Gambia"),

    /**
     * Georgia.
     */
    @XmlEnumValue("GE")
    GE("Georgia"),

    /**
     * Germany.
     */
    @XmlEnumValue("DE")
    DE("Germany"),

    /**
     * Ghana.
     */
    @XmlEnumValue("GH")
    GH("Ghana"),

    /**
     * Gibraltar.
     */
    @XmlEnumValue("GI")
    GI("Gibraltar"),

    /**
     * Greece.
     */
    @XmlEnumValue("GR")
    GR("Greece"),

    /**
     * Greenland.
     */
    @XmlEnumValue("GL")
    GL("Greenland"),

    /**
     * Grenada.
     */
    @XmlEnumValue("GD")
    GD("Grenada"),

    /**
     * Guadeloupe.
     */
    @XmlEnumValue("GP")
    GP("Guadeloupe"),

    /**
     * Guam.
     */
    @XmlEnumValue("GU")
    GU("Guam"),

    /**
     * Guatemala.
     */
    @XmlEnumValue("GT")
    GT("Guatemala"),

    /**
     * Guernsey.
     */
    @XmlEnumValue("GG")
    GG("Guernsey"),

    /**
     * Guinea.
     */
    @XmlEnumValue("GN")
    GN("Guinea"),

    /**
     * Guinea-Bissau.
     */
    @XmlEnumValue("GW")
    GW("Guinea-Bissau"),

    /**
     * Guyana.
     */
    @XmlEnumValue("GY")
    GY("Guyana"),

    /**
     * Haiti.
     */
    @XmlEnumValue("HT")
    HT("Haiti"),

    /**
     * Heard Island and McDonald Islands.
     */
    @XmlEnumValue("HM")
    HM("Heard Island and McDonald Islands"),

    /**
     * Holy See (Vatican City State).
     */
    @XmlEnumValue("VA")
    VA("Holy See (Vatican City State)"),

    /**
     * Honduras.
     */
    @XmlEnumValue("HN")
    HN("Honduras"),

    /**
     * Hong Kong.
     */
    @XmlEnumValue("HK")
    HK("Hong Kong"),

    /**
     * Hungary.
     */
    @XmlEnumValue("HU")
    HU("Hungary"),

    /**
     * Iceland.
     */
    @XmlEnumValue("IS")
    IS("Iceland"),

    /**
     * India.
     */
    @XmlEnumValue("IN")
    IN("India"),

    /**
     * Indonesia.
     */
    @XmlEnumValue("ID")
    ID("Indonesia"),

    /**
     * Iran, Islamic Republic of.
     */
    @XmlEnumValue("IR")
    IR("Iran, Islamic Republic of"),

    /**
     * Iraq.
     */
    @XmlEnumValue("IQ")
    IQ("Iraq"),

    /**
     * Ireland.
     */
    @XmlEnumValue("IE")
    IE("Ireland"),

    /**
     * Isle of Man.
     */
    @XmlEnumValue("IM")
    IM("Isle of Man"),

    /**
     * Israel.
     */
    @XmlEnumValue("IL")
    IL("Israel"),

    /**
     * Italy.
     */
    @XmlEnumValue("IT")
    IT("Italy"),

    /**
     * Jamaica.
     */
    @XmlEnumValue("JM")
    JM("Jamaica"),

    /**
     * Japan.
     */
    @XmlEnumValue("JP")
    JP("Japan"),

    /**
     * Jersey.
     */
    @XmlEnumValue("JE")
    JE("Jersey"),

    /**
     * Jordan.
     */
    @XmlEnumValue("JO")
    JO("Jordan"),

    /**
     * Kazakhstan.
     */
    @XmlEnumValue("KZ")
    KZ("Kazakhstan"),

    /**
     * Kenya.
     */
    @XmlEnumValue("KE")
    KE("Kenya"),

    /**
     * Kiribati.
     */
    @XmlEnumValue("KI")
    KI("Kiribati"),

    /**
     * Korea, Democratic People's Republic of.
     */
    @XmlEnumValue("KP")
    KP("Korea, Democratic People's Republic of"),

    /**
     * Korea, Republic of.
     */
    @XmlEnumValue("KR")
    KR("Korea, Republic of"),

    /**
     * Kuwait.
     */
    @XmlEnumValue("KW")
    KW("Kuwait"),

    /**
     * Kyrgyzstan.
     */
    @XmlEnumValue("KG")
    KG("Kyrgyzstan"),

    /**
     * Lao People's Democratic Republic.
     */
    @XmlEnumValue("LA")
    LA("Lao People's Democratic Republic"),

    /**
     * Latvia.
     */
    @XmlEnumValue("LV")
    LV("Latvia"),

    /**
     * Lebanon.
     */
    @XmlEnumValue("LB")
    LB("Lebanon"),

    /**
     * Lesotho.
     */
    @XmlEnumValue("LS")
    LS("Lesotho"),

    /**
     * Liberia.
     */
    @XmlEnumValue("LR")
    LR("Liberia"),

    /**
     * Libyan Arab Jamahiriya.
     */
    @XmlEnumValue("LY")
    LY("Libyan Arab Jamahiriya"),

    /**
     * Liechtenstein.
     */
    @XmlEnumValue("LI")
    LI("Liechtenstein"),

    /**
     * Lithuania.
     */
    @XmlEnumValue("LT")
    LT("Lithuania"),

    /**
     * Luxembourg.
     */
    @XmlEnumValue("LU")
    LU("Luxembourg"),

    /**
     * Macao.
     */
    @XmlEnumValue("MO")
    MO("Macao"),

    /**
     * Macedonia, The Former Yugoslav Republic of.
     */
    @XmlEnumValue("MK")
    MK("Macedonia, The Former Yugoslav Republic of"),

    /**
     * Madagascar.
     */
    @XmlEnumValue("MG")
    MG("Madagascar"),

    /**
     * Malawi.
     */
    @XmlEnumValue("MW")
    MW("Malawi"),

    /**
     * Malaysia.
     */
    @XmlEnumValue("MY")
    MY("Malaysia"),

    /**
     * Maldives.
     */
    @XmlEnumValue("MV")
    MV("Maldives"),

    /**
     * Mali.
     */
    @XmlEnumValue("ML")
    ML("Mali"),

    /**
     * Malta.
     */
    @XmlEnumValue("MT")
    MT("Malta"),

    /**
     * Marshall Islands.
     */
    @XmlEnumValue("MH")
    MH("Marshall Islands"),

    /**
     * Martinique.
     */
    @XmlEnumValue("MQ")
    MQ("Martinique"),

    /**
     * Mauritania.
     */
    @XmlEnumValue("MR")
    MR("Mauritania"),

    /**
     * Mauritius.
     */
    @XmlEnumValue("MU")
    MU("Mauritius"),

    /**
     * Mayotte.
     */
    @XmlEnumValue("YT")
    YT("Mayotte"),

    /**
     * Mexico.
     */
    @XmlEnumValue("MX")
    MX("Mexico"),

    /**
     * Micronesia, Federated States of.
     */
    @XmlEnumValue("FM")
    FM("Micronesia, Federated States of"),

    /**
     * Moldova, Republic of.
     */
    @XmlEnumValue("MD")
    MD("Moldova, Republic of"),

    /**
     * Monaco.
     */
    @XmlEnumValue("MC")
    MC("Monaco"),

    /**
     * Mongolia.
     */
    @XmlEnumValue("MN")
    MN("Mongolia"),

    /**
     * Montenegro.
     */
    @XmlEnumValue("ME")
    ME("Montenegro"),

    /**
     * Montserrat.
     */
    @XmlEnumValue("MS")
    MS("Montserrat"),

    /**
     * Morocco.
     */
    @XmlEnumValue("MA")
    MA("Morocco"),

    /**
     * Mozambique.
     */
    @XmlEnumValue("MZ")
    MZ("Mozambique"),

    /**
     * Myanmar.
     */
    @XmlEnumValue("MM")
    MM("Myanmar"),

    /**
     * Namibia.
     */
    @XmlEnumValue("NA")
    NA("Namibia"),

    /**
     * Nauru.
     */
    @XmlEnumValue("NR")
    NR("Nauru"),

    /**
     * Nepal.
     */
    @XmlEnumValue("NP")
    NP("Nepal"),

    /**
     * Netherlands.
     */
    @XmlEnumValue("NL")
    NL("Netherlands"),

    /**
     * Netherlands Antilles.
     */
    @XmlEnumValue("AN")
    AN("Netherlands Antilles"),

    /**
     * New Caledonia.
     */
    @XmlEnumValue("NC")
    NC("New Caledonia"),

    /**
     * New Zealand.
     */
    @XmlEnumValue("NZ")
    NZ("New Zealand"),

    /**
     * Nicaragua.
     */
    @XmlEnumValue("NI")
    NI("Nicaragua"),

    /**
     * Niger.
     */
    @XmlEnumValue("NE")
    NE("Niger"),

    /**
     * Nigeria.
     */
    @XmlEnumValue("NG")
    NG("Nigeria"),

    /**
     * Niue.
     */
    @XmlEnumValue("NU")
    NU("Niue"),

    /**
     * Norfolk Island.
     */
    @XmlEnumValue("NF")
    NF("Norfolk Island"),

    /**
     * Northern Mariana Islands.
     */
    @XmlEnumValue("MP")
    MP("Northern Mariana Islands"),

    /**
     * Norway.
     */
    @XmlEnumValue("NO")
    NO("Norway"),

    /**
     * Oman.
     */
    @XmlEnumValue("OM")
    OM("Oman"),

    /**
     * Pakistan.
     */
    @XmlEnumValue("PK")
    PK("Pakistan"),

    /**
     * Palau.
     */
    @XmlEnumValue("PW")
    PW("Palau"),

    /**
     * Palestinian Territory, Occupied.
     */
    @XmlEnumValue("PS")
    PS("Palestinian Territory, Occupied"),

    /**
     * Panama.
     */
    @XmlEnumValue("PA")
    PA("Panama"),

    /**
     * Papua New Guinea.
     */
    @XmlEnumValue("PG")
    PG("Papua New Guinea"),

    /**
     * Paraguay.
     */
    @XmlEnumValue("PY")
    PY("Paraguay"),

    /**
     * Peru.
     */
    @XmlEnumValue("PE")
    PE("Peru"),

    /**
     * Philippines.
     */
    @XmlEnumValue("PH")
    PH("Philippines"),

    /**
     * Pitcairn.
     */
    @XmlEnumValue("PN")
    PN("Pitcairn"),

    /**
     * Poland.
     */
    @XmlEnumValue("PL")
    PL("Poland"),

    /**
     * Portugal.
     */
    @XmlEnumValue("PT")
    PT("Portugal"),

    /**
     * Puerto Rico.
     */
    @XmlEnumValue("PR")
    PR("Puerto Rico"),

    /**
     * Qatar.
     */
    @XmlEnumValue("QA")
    QA("Qatar"),

    /**
     * Réunion.
     */
    @XmlEnumValue("RE")
    RE("Réunion"),

    /**
     * Romania.
     */
    @XmlEnumValue("RO")
    RO("Romania"),

    /**
     * Russian Federation.
     */
    @XmlEnumValue("RU")
    RU("Russian Federation"),

    /**
     * Rwanda.
     */
    @XmlEnumValue("RW")
    RW("Rwanda"),

    /**
     * Saint Barthélemy.
     */
    @XmlEnumValue("BL")
    BL("Saint Barthélemy"),

    /**
     * Saint Helena.
     */
    @XmlEnumValue("SH")
    SH("Saint Helena"),

    /**
     * Saint Kitts and Nevis.
     */
    @XmlEnumValue("KN")
    KN("Saint Kitts and Nevis"),

    /**
     * Saint Lucia.
     */
    @XmlEnumValue("LC")
    LC("Saint Lucia"),

    /**
     * Saint Martin.
     */
    @XmlEnumValue("MF")
    MF("Saint Martin"),

    /**
     * Saint Pierre and Miquelon.
     */
    @XmlEnumValue("PM")
    PM("Saint Pierre and Miquelon"),

    /**
     * Saint Vincent and the Grenadines.
     */
    @XmlEnumValue("VC")
    VC("Saint Vincent and the Grenadines"),

    /**
     * Samoa.
     */
    @XmlEnumValue("WS")
    WS("Samoa"),

    /**
     * San Marino.
     */
    @XmlEnumValue("SM")
    SM("San Marino"),

    /**
     * Sao Tome and Principe.
     */
    @XmlEnumValue("ST")
    ST("Sao Tome and Principe"),

    /**
     * Saudi Arabia.
     */
    @XmlEnumValue("SA")
    SA("Saudi Arabia"),

    /**
     * Senegal.
     */
    @XmlEnumValue("SN")
    SN("Senegal"),

    /**
     * Serbia.
     */
    @XmlEnumValue("RS")
    RS("Serbia"),

    /**
     * Seychelles.
     */
    @XmlEnumValue("SC")
    SC("Seychelles"),

    /**
     * Sierra Leone.
     */
    @XmlEnumValue("SL")
    SL("Sierra Leone"),

    /**
     * Singapore.
     */
    @XmlEnumValue("SG")
    SG("Singapore"),

    /**
     * Slovakia.
     */
    @XmlEnumValue("SK")
    SK("Slovakia"),

    /**
     * Slovenia.
     */
    @XmlEnumValue("SI")
    SI("Slovenia"),

    /**
     * Solomon Islands.
     */
    @XmlEnumValue("SB")
    SB("Solomon Islands"),

    /**
     * Somalia.
     */
    @XmlEnumValue("SO")
    SO("Somalia"),

    /**
     * South Africa.
     */
    @XmlEnumValue("ZA")
    ZA("South Africa"),

    /**
     * South Georgia and the South Sandwich Islands.
     */
    @XmlEnumValue("GS")
    GS("South Georgia and the South Sandwich Islands"),

    /**
     * Spain.
     */
    @XmlEnumValue("ES")
    ES("Spain"),

    /**
     * Sri Lanka.
     */
    @XmlEnumValue("LK")
    LK("Sri Lanka"),

    /**
     * Sudan.
     */
    @XmlEnumValue("SD")
    SD("Sudan"),

    /**
     * Suriname.
     */
    @XmlEnumValue("SR")
    SR("Suriname"),

    /**
     * Svalbard and Jan Mayen.
     */
    @XmlEnumValue("SJ")
    SJ("Svalbard and Jan Mayen"),

    /**
     * Swaziland.
     */
    @XmlEnumValue("SZ")
    SZ("Swaziland"),

    /**
     * Sweden.
     */
    @XmlEnumValue("SE")
    SE("Sweden"),

    /**
     * Switzerland.
     */
    @XmlEnumValue("CH")
    CH("Switzerland"),

    /**
     * Syrian Arab Republic.
     */
    @XmlEnumValue("SY")
    SY("Syrian Arab Republic"),

    /**
     * Taiwan, Province of China.
     */
    @XmlEnumValue("TW")
    TW("Taiwan, Province of China"),

    /**
     * Tajikistan.
     */
    @XmlEnumValue("TJ")
    TJ("Tajikistan"),

    /**
     * Tanzania, United Republic of.
     */
    @XmlEnumValue("TZ")
    TZ("Tanzania, United Republic of"),

    /**
     * Thailand.
     */
    @XmlEnumValue("TH")
    TH("Thailand"),

    /**
     * Timor-Leste.
     */
    @XmlEnumValue("TL")
    TL("Timor-Leste"),

    /**
     * Togo.
     */
    @XmlEnumValue("TG")
    TG("Togo"),

    /**
     * Tokelau.
     */
    @XmlEnumValue("TK")
    TK("Tokelau"),

    /**
     * Tonga.
     */
    @XmlEnumValue("TO")
    TO("Tonga"),

    /**
     * Trinidad and Tobago.
     */
    @XmlEnumValue("TT")
    TT("Trinidad and Tobago"),

    /**
     * Tunisia.
     */
    @XmlEnumValue("TN")
    TN("Tunisia"),

    /**
     * Turkey.
     */
    @XmlEnumValue("TR")
    TR("Turkey"),

    /**
     * Turkmenistan.
     */
    @XmlEnumValue("TM")
    TM("Turkmenistan"),

    /**
     * Turks and Caicos Islands.
     */
    @XmlEnumValue("TC")
    TC("Turks and Caicos Islands"),

    /**
     * Tuvalu.
     */
    @XmlEnumValue("TV")
    TV("Tuvalu"),

    /**
     * Uganda.
     */
    @XmlEnumValue("UG")
    UG("Uganda"),

    /**
     * Ukraine.
     */
    @XmlEnumValue("UA")
    UA("Ukraine"),

    /**
     * United Arab Emirates.
     */
    @XmlEnumValue("AE")
    AE("United Arab Emirates"),

    /**
     * England. This is not officially supported by the standard but provided for compatibility.
     */
    @XmlEnumValue("EN")
    EN("England"),

    /**
     * United Kingdom.
     */
    @XmlEnumValue("GB")
    GB("United Kingdom"),

    /**
     * United Kingdom. This is not officially supported by the standard but provided for compatibility.
     */
    @XmlEnumValue("UK")
    UK("United Kingdom"),

    /**
     * United States.
     */
    @XmlEnumValue("US")
    US("United States"),

    /**
     * United States Minor Outlying Islands.
     */
    @XmlEnumValue("UM")
    UM("United States Minor Outlying Islands"),

    /**
     * Uruguay.
     */
    @XmlEnumValue("UY")
    UY("Uruguay"),

    /**
     * Uzbekistan.
     */
    @XmlEnumValue("UZ")
    UZ("Uzbekistan"),

    /**
     * Vanuatu.
     */
    @XmlEnumValue("VU")
    VU("Vanuatu"),

    /**
     * Venezuela, Bolivarian Republic of.
     */
    @XmlEnumValue("VE")
    VE("Venezuela, Bolivarian Republic of"),

    /**
     * Viet Nam.
     */
    @XmlEnumValue("VN")
    VN("Viet Nam"),

    /**
     * Virgin Islands, British.
     */
    @XmlEnumValue("VG")
    VG("Virgin Islands, British"),

    /**
     * Virgin Islands, U.S..
     */
    @XmlEnumValue("VI")
    VI("Virgin Islands, U.S."),

    /**
     * Wallis and Futuna.
     */
    @XmlEnumValue("WF")
    WF("Wallis and Futuna"),

    /**
     * Western Sahara.
     */
    @XmlEnumValue("EH")
    EH("Western Sahara"),

    /**
     * Yemen.
     */
    @XmlEnumValue("YE")
    YE("Yemen"),

    /**
     * Zambia.
     */
    @XmlEnumValue("ZM")
    ZM("Zambia"),

    /**
     * Zimbabwe.
     */
    @XmlEnumValue("ZW")
    ZW("Zimbabwe");

    /**
     * The country name.
     */
    private String name;

    /**
     * Default constructor.
     *
     * @param name The country name.
     */
    ISO_3166_1_alpha2(final String name)
    {

        this.name = name;
    }

    /**
     * Retrieve the country name.
     *
     * @return The country name.
     */
    public String getName()
    {

        return this.name;
    }
}
