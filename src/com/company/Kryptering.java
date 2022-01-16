package com.company;

public class Kryptering {
    public static String kryptertTekst;

    public static String krypter(String text, int tall) throws Exception {

            StringBuilder sb = new StringBuilder();


            for (char bokstav : text.toCharArray()) {
                if (bokstav != ' ') {
                    int OrginalPosisjon = bokstav - 'a';
                    int nyPosisjon = (OrginalPosisjon  + tall) % 26;
                    char nybokstav = (char) ('a' + nyPosisjon);
                    sb.append(nybokstav);
                } else {
                    sb.append(bokstav);
                }
            }

           kryptertTekst = sb.toString();
            return kryptertTekst;
        }
    }

