package Data;

import modelos.Moneda;

import java.util.ArrayList;
import java.util.List;

public class AllMonedas {
    private List<Moneda> monedas;
    private List<Moneda> principalesMonedas;

    public AllMonedas() {
        monedas = new ArrayList<>();
        inicializarMonedas();

        principalesMonedas = new ArrayList<>();
        inicializarPrincipalesMonedas();
    }

    private void inicializarPrincipalesMonedas(){
        principalesMonedas.add(new Moneda("USD", "Dólar de los Estados Unidos", "Estados Unidos"));
        principalesMonedas.add(new Moneda("EUR", "Euro", "Unión Europea"));
        principalesMonedas.add(new Moneda("JPY", "Yen japonés", "Japón"));
        principalesMonedas.add(new Moneda("GBP", "Libra esterlina", "Reino Unido"));
        principalesMonedas.add(new Moneda("AUD", "Dólar australiano", "Australia"));
        principalesMonedas.add(new Moneda("CAD", "Dólar canadiense", "Canadá"));
        principalesMonedas.add(new Moneda("CNY", "Renminbi chino", "China"));
        principalesMonedas.add(new Moneda("SEK", "Corona sueca", "Suecia"));
        principalesMonedas.add(new Moneda("NZD", "Dólar neozelandés", "Nueva Zelanda"));
        principalesMonedas.add(new Moneda("KRW", "Won surcoreano", "Corea del Sur"));
        principalesMonedas.add(new Moneda("MXN", "Peso Mexicano", "México"));
        principalesMonedas.add(new Moneda("INR", "Rupia india", "India"));
        principalesMonedas.add(new Moneda("RUB", "Rublo ruso", "Rusia"));
        principalesMonedas.add(new Moneda("BRL", "Real brasileño", "Brasil"));
        principalesMonedas.add(new Moneda("TWD", "Nuevo dólar taiwanés", "Taiwán"));  
    }

    private void inicializarMonedas() {
        monedas.add(new Moneda("DEA", "Dírham de los Emiratos Árabes Unidos", "Emiratos Árabes Unidos"));
        monedas.add(new Moneda("AFN", "Afgano Afgano", "Afganistán"));
        monedas.add(new Moneda("ALL", "Lek albanés", "Albania"));
        monedas.add(new Moneda("AMD", "Dram armenio", "Armenia"));
        monedas.add(new Moneda("ANG", "Florín antilliano de los Países Bajos", "Antillas Neerlandesas"));
        monedas.add(new Moneda("AOA", "Kwanza angoleño", "Angola"));
        monedas.add(new Moneda("ARS", "Peso Argentino", "Argentina"));
        monedas.add(new Moneda("AUD", "Dólar australiano", "Australia"));
        monedas.add(new Moneda("AWG", "Florín de Aruba", "Aruba"));
        monedas.add(new Moneda("AZN", "Manat azerbaiyano", "Azerbaiyán"));
        monedas.add(new Moneda("BAM", "Marcos de Bosnia y Herzegovina", "Bosnia-Herzegovina"));
        monedas.add(new Moneda("BBD", "Dólar de Barbados", "Barbados"));
        monedas.add(new Moneda("BDT", "Taka bangladesí", "Bangladesh"));
        monedas.add(new Moneda("BGN", "Lev búlgaro", "Bulgaria"));
        monedas.add(new Moneda("BHD", "Dinar bahreiní", "Bahrein"));
        monedas.add(new Moneda("BIF", "Franco burundés", "Burundi"));
        monedas.add(new Moneda("BMD", "Dólar de las Bermudas", "Bermudas"));
        monedas.add(new Moneda("BND", "Dólar de Brunéi", "Brunéi"));
        monedas.add(new Moneda("BOB", "Bolivian Boliviano", "Bolivia"));
        monedas.add(new Moneda("BRL", "Real brasileño", "Brasil"));
        monedas.add(new Moneda("BSD", "Dólar bahameño", "Bahamas"));
        monedas.add(new Moneda("BTN", "Ngultrum butanés", "Bhután"));
        monedas.add(new Moneda("BWP", "Botswana Pula", "Botswana"));
        monedas.add(new Moneda("BYN", "Rublo bielorruso", "Bielorrusia"));
        monedas.add(new Moneda("BZD", "Dólar de Belice", "Belice"));
        monedas.add(new Moneda("CAD", "Dólar canadiense", "Canadá"));
        monedas.add(new Moneda("CDF", "Franco congoleño", "República Democrática del Congo"));
        monedas.add(new Moneda("CHF", "Franco suizo", "Suiza"));
        monedas.add(new Moneda("CLP", "Peso Chileno", "Chile"));
        monedas.add(new Moneda("CNY", "Renminbi chino", "China"));
        monedas.add(new Moneda("COP", "Peso Colombiano", "Colombia"));
        monedas.add(new Moneda("CRC", "Colón costarricense", "Costa Rica"));
        monedas.add(new Moneda("CUP", "Peso Cubano", "Cuba"));
        monedas.add(new Moneda("CVE", "Escudo caboverdiano", "Cabo Verde"));
        monedas.add(new Moneda("CZK", "Corona checa", "República Checa"));
        monedas.add(new Moneda("DJF", "Franco de Djibouti", "Yibuti"));
        monedas.add(new Moneda("DKK", "Corona danesa", "Dinamarca"));
        monedas.add(new Moneda("DOP", "Peso Dominicano", "República Dominicana"));
        monedas.add(new Moneda("DZD", "Dinar argelino", "Argelia"));
        monedas.add(new Moneda("EGP", "Libra egipcia", "Egipto"));
        monedas.add(new Moneda("ERN", "Nakfa eritrea", "Eritrea"));
        monedas.add(new Moneda("ETB", "Birr etíope", "Etiopía"));
        monedas.add(new Moneda("EUR", "Euro", "Unión Europea"));
        monedas.add(new Moneda("FJD", "Dólar de Fiji", "Fiji"));
        monedas.add(new Moneda("FKP", "Libra de las Islas Malvinas", "Islas Malvinas"));
        monedas.add(new Moneda("FOK", "Corona feroesa", "Islas Faroe"));
        monedas.add(new Moneda("GBP", "Libra esterlina", "Reino Unido"));
        monedas.add(new Moneda("GEL", "Lari georgiano", "Georgia"));
        monedas.add(new Moneda("GGP", "Libra de Guernsey", "Guernsey"));
        monedas.add(new Moneda("GHS", "Cedi ghanés", "Ghana"));
        monedas.add(new Moneda("GIP", "Libra de Gibraltar", "Gibraltar"));
        monedas.add(new Moneda("GMD", "Dalasi gambiano", "Gambia"));
        monedas.add(new Moneda("GNF", "Franco guineano", "Guinea"));
        monedas.add(new Moneda("GTQ", "Quetzal guatemalteco", "Guatemala"));
        monedas.add(new Moneda("GYD", "Dólar guyanés", "Guyana"));
        monedas.add(new Moneda("HKD", "Dólar de Hong Kong", "Hong Kong"));
        monedas.add(new Moneda("HNL", "Lempira hondureño", "Honduras"));
        monedas.add(new Moneda("HRK", "Kuna croata", "Croacia"));
        monedas.add(new Moneda("HTG", "Gourde haitiano", "Haití"));
        monedas.add(new Moneda("HUF", "Florín húngaro", "Hungría"));
        monedas.add(new Moneda("IDR", "Rupia indonesia", "Indonesia"));
        monedas.add(new Moneda("ILS", "Nuevo Shekel israelí", "Israel"));
        monedas.add(new Moneda("IMP", "Libra de Manx", "Isla de Man"));
        monedas.add(new Moneda("INR", "Rupia india", "India"));
        monedas.add(new Moneda("IQD", "Dinar iraquí", "Irak"));
        monedas.add(new Moneda("IRR", "Rial iraní", "Irán"));
        monedas.add(new Moneda("ISK", "Corona islandesa", "Islandia"));
        monedas.add(new Moneda("JEP", "Libra de Jersey", "Jersey"));
        monedas.add(new Moneda("JMD", "Dólar jamaiquino", "Jamaica"));
        monedas.add(new Moneda("JOD", "Dinar jordano", "Jordania"));
        monedas.add(new Moneda("JPY", "Yen japonés", "Japón"));
        monedas.add(new Moneda("KES", "Chelín keniano", "Kenia"));
        monedas.add(new Moneda("KGS", "Kirguistán som", "Kirguizistán"));
        monedas.add(new Moneda("KHR", "Riel camboyano", "Camboya"));
        monedas.add(new Moneda("KID", "Dólar de Kiribati", "Kiribati"));
        monedas.add(new Moneda("KMF", "Franco de las Comoras", "Comoras"));
        monedas.add(new Moneda("KRW", "Won surcoreano", "Corea del Sur"));
        monedas.add(new Moneda("KWD", "Dinar kuwaití", "Kuwait"));
        monedas.add(new Moneda("KYD", "Dólar de las Islas Caimán", "Islas Caimán"));
        monedas.add(new Moneda("KZT", "Tenge kazajo", "Kazajstán"));
        monedas.add(new Moneda("LAK", "Lao Kip", "Laos"));
        monedas.add(new Moneda("LBP", "Libra libanesa", "Líbano"));
        monedas.add(new Moneda("LKR", "Rupia de Sri Lanka", "Sri Lanka"));
        monedas.add(new Moneda("LRD", "Dólar liberiano", "Liberia"));
        monedas.add(new Moneda("LSL", "Lesotho Loti", "Lesotho"));
        monedas.add(new Moneda("LYD", "Dinar libio", "Libia"));
        monedas.add(new Moneda("MAD", "Dírham marroquí", "Marruecos"));
        monedas.add(new Moneda("MDL", "Leu moldavo", "Moldavia"));
        monedas.add(new Moneda("MGA", "Ariary malgache", "Madagascar"));
        monedas.add(new Moneda("MKD", "Denar macedonio", "Macedonia del Norte"));
        monedas.add(new Moneda("MMK", "Kyat birmano", "Myanmar"));
        monedas.add(new Moneda("MNT", "Tögrög mongol", "Mongolia"));
        monedas.add(new Moneda("MOP", "Pataca macaense", "Macao"));
        monedas.add(new Moneda("MRU", "Ouguiya mauritano", "Mauritania"));
        monedas.add(new Moneda("MUR", "Rupia mauriciana", "Mauricio"));
        monedas.add(new Moneda("MVR", "Rufiyaa de Maldivas", "Maldivas"));
        monedas.add(new Moneda("MWK", "Kwacha malauí", "Malawi"));
        monedas.add(new Moneda("MXN", "Peso Mexicano", "México"));
        monedas.add(new Moneda("MYR", "Ringgit malayo", "Malasia"));
        monedas.add(new Moneda("MZN", "Metical mozambiqueño", "Mozambique"));
        monedas.add(new Moneda("NAD", "Dólar namibio", "Namibia"));
        monedas.add(new Moneda("NGN", "Naira nigeriana", "Nigeria"));
        monedas.add(new Moneda("NIO", "Córdoba nicaragüense", "Nicaragua"));
        monedas.add(new Moneda("NOK", "Corona noruega", "Noruega"));
        monedas.add(new Moneda("NPR", "Rupia nepalí", "Nepal"));
        monedas.add(new Moneda("NZD", "Dólar neozelandés", "Nueva Zelanda"));
        monedas.add(new Moneda("OMR", "Rial omaní", "Omán"));
        monedas.add(new Moneda("PAB", "Balboa panameño", "Panamá"));
        monedas.add(new Moneda("PEN", "Sol Peruano", "Perú"));
        monedas.add(new Moneda("PGK", "Kina de Papúa Nueva Guinea", "Papúa Nueva Guinea"));
        monedas.add(new Moneda("PHP", "Peso filipino", "Filipinas"));
        monedas.add(new Moneda("PKR", "Rupia pakistaní", "Pakistán"));
        monedas.add(new Moneda("PLN", "Złoty polaco", "Polonia"));
        monedas.add(new Moneda("PYG", "Guaraní paraguayo", "Paraguay"));
        monedas.add(new Moneda("QAR", "Riyal catarí", "Qatar"));
        monedas.add(new Moneda("RON", "Leu rumano", "Rumania"));
        monedas.add(new Moneda("RSD", "Dinar serbio", "Serbia"));
        monedas.add(new Moneda("RUB", "Rublo ruso", "Rusia"));
        monedas.add(new Moneda("RWF", "Franco ruandés", "Ruanda"));
        monedas.add(new Moneda("SAR", "Riyal saudí", "Arabia Saudí"));
        monedas.add(new Moneda("SBD", "Dólar de las Islas Salomón", "Islas Salomón"));
        monedas.add(new Moneda("SCR", "Rupia de Seychelles", "Seychelles"));
        monedas.add(new Moneda("SDG", "Libra sudanesa", "Sudán"));
        monedas.add(new Moneda("SEK", "Corona sueca", "Suecia"));
        monedas.add(new Moneda("SGD", "Dólar de Singapur", "Singapur"));
        monedas.add(new Moneda("SHP", "Libra de Santa Elena", "Santa Elena"));
        monedas.add(new Moneda("SLL", "Sierra Leona Leona", "Sierra Leona"));
        monedas.add(new Moneda("SOS", "Chelín somalí", "Somalia"));
        monedas.add(new Moneda("SRD", "Dólar de Surinam", "Suriname"));
        monedas.add(new Moneda("SSP", "Libra sursudanesa", "Sudán del Sur"));
        monedas.add(new Moneda("STN", "Santo Tomé y Príncipe Dobra", "Santo Tomé y Príncipe"));
        monedas.add(new Moneda("SYP", "Libra siria", "Siria"));
        monedas.add(new Moneda("SZL", "Esuatini Lilangeni", "Esuatini"));
        monedas.add(new Moneda("THB", "Baht tailandés", "Tailandia"));
        monedas.add(new Moneda("TJS", "Somoni tayiko", "Tayikistán"));
        monedas.add(new Moneda("TMT", "Turkmenistán Manat", "Turkmenistán"));
        monedas.add(new Moneda("TND", "Dinar tunecino", "Túnez"));
        monedas.add(new Moneda("TOP", "Paanga de Tonga", "Tonga"));
        monedas.add(new Moneda("TRY", "Lira turca", "Turquía"));
        monedas.add(new Moneda("TTD", "Dólar de Trinidad y Tobago", "Trinidad y Tobago"));
        monedas.add(new Moneda("TVD", "Dólar de Tuvalu", "Tuvalu"));
        monedas.add(new Moneda("TWD", "Nuevo dólar taiwanés", "Taiwán"));
        monedas.add(new Moneda("TZS", "Chelín tanzano", "Tanzania"));
        monedas.add(new Moneda("UAH", "Grivna ucraniana", "Ucrania"));
        monedas.add(new Moneda("UGX", "Chelín ugandés", "Uganda"));
        monedas.add(new Moneda("USD", "Dólar de los Estados Unidos", "Estados Unidos"));
        monedas.add(new Moneda("UYU", "Peso Uruguayo", "Uruguay"));
        monedas.add(new Moneda("UZS", "Uzbeko So'm", "Uzbekistán"));
        monedas.add(new Moneda("VES", "Bolívar Soberano venezolano", "Venezuela"));
        monedas.add(new Moneda("VND", "Đồng vietnamita", "Vietnam"));
        monedas.add(new Moneda("VUV", "Vanuatu Vatu", "Vanuatu"));
        monedas.add(new Moneda("WST", "Tālā de Samoa", "Samoa"));
        monedas.add(new Moneda("XAF", "Franco CFA centroafricano", "CEMAC"));
        monedas.add(new Moneda("XCD", "Dólar del Caribe Oriental", "Organización de Estados del Caribe Oriental"));
        monedas.add(new Moneda("XDR", "Derechos Especiales de Giro", "Fondo Monetario Internacional"));
        monedas.add(new Moneda("XOF", "Franco CFA de África Occidental", "CFA"));
        monedas.add(new Moneda("XPF", "Franco CFP", "Collectivités d'Outre-Mer"));
        monedas.add(new Moneda("YER", "Rial yemení", "Yemen"));
        monedas.add(new Moneda("ZAR", "Rand sudafricano", "Sudáfrica"));
        monedas.add(new Moneda("ZMW", "Kwacha zambiano", "Zambia"));
        monedas.add(new Moneda("ZWL", "Dólar zimbabuense", "Zimbabue"));
    }

    public List<Moneda> getMonedas() {
        return monedas;
    }

    public List<Moneda> getPrincipalesMonedas() {
        return principalesMonedas;
    }
}