package com.company;

public class deKryptering {

        public static String dekryptertTekst;

        public static String dekrypter(String text, int tall) throws Exception {

            StringBuilder sb = new StringBuilder();

            for (char bokstaver : text.toCharArray()) {
                if (bokstaver != ' ') {
                    int OrginalPosisjon = bokstaver - 'a';
                    int nyPosisjon = (OrginalPosisjon  + (26 - tall)) % 26;
                    char nybokstav = (char) ('a' + nyPosisjon);
                    sb.append(nybokstav);
                } else {
                    sb.append(bokstaver);
                }
            }

            dekryptertTekst = sb.toString();
            return dekryptertTekst;
        }
    }

