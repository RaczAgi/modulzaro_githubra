public class Modulzaro {
    /**
     * INSTRUKCIÓK - OLVASD EL, MIELŐTT NEKIKEZDESZ!
     *
     * Csak szintaktikailag helyes, futtatható kódot küldj be!
     *
     * Ne írd át a már megírt metódusok szignatúráját!
     * Figyelj arra, hogy tényleg a feladatot oldd meg!
     * Figyelj arra, hogy a metódusok visszatérési értéke tényleg a feladatban elvárt legyen!
     * Törekedj arra, hogy egyszerű megoldásokat írj!
     *
     * Pontozzuk a kódod olvashatóságát, ezért törekedj a beszédes változónevek használatára!
     * Pontozzuk a mérnöki hozzáállást is, ezért törekedj a szélsőséges esetek kezelésére, bemeneti paraméterek
     * ellenőrzésére!
     *
     * Írhatsz saját metódusokat is, ha szükségesnek érzed.
     * Azonban az általad írt plusz metódusok szerepeljenek ebben a fájlban, továbbá
     * a feladatok megoldását a már megírt metódusok tartalmazzák!
     *
     * Jó munkát!
     */
    public static void main(String[] args) {
        // TODO itt tudod tesztelni a megírt metódusaidat
    }

    /**
     * --- PONTOZÁS ----
     * A TELJES DOLGOZAT ÖSSZPONTSZÁMA 25 PONT.
     * Össze lehet gyűjteni ezen felül 10 extra pontot is a szorgalmi feladattal és bónusz pontok szerzésével.
     *
     * -> FELADATOK: 25 pont
     * 1. Feladat - getLastNumber - 2 pont
     * 2. Feladat - countEvenNumbers - 3 pont
     * 3. Feladat - findNumber - 4 pont
     * 4. Feladat - findMaxIndex - 5 pont
     * 5. Feladat - countSameNumbers - 6 pont
     * 6. Feladat - decodeAcrostic - 5 pont
     *
     * -> SZORGALMI: 6 pont
     * 7. Feladat - findTheOneSock - 6 pont
     *
     * -> PLUSZ PONTOK: 4 pont
     * Kód külalakja: olvasható, jól tördelt kód, beszédes változónevek (2 pont)
     * Mérnöki hozzáállás: bemeneti paraméterek ellenőrzése, szélsőséges esetek kezelése (2 pont)
     *
     * -> ÖSSZESEN SZEREZHETŐ: 25 pont + 4 pont + 6 pont
     */


    /**
     * [1. Feladat]
     * Valósítsd meg a getLastNumber metódust! A metódus adja vissza a paraméterként kapott mátrix utolsó elemét!
     * Fontos: a metódusnak bármilyen nagyságú (és nem feltétlenül szimmetrikus) mátrixra működnie kell!
     * (2 pont)
     */
    public static int getLastNumber(int[][] matrix) {

        return matrix[matrix.length-1][matrix[matrix.length-1].length-1];
    }

    /**
     * [2. Feladat]
     * Valósítsd meg a countEvenNumbers metódust! A metódus adja vissza, hogy a paraméterként kapott tömbben
     * hány páros szám szerepel!
     * (3 pont)
     */
    public static int countEvenNumbers(int[] array) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * [3. Feladat]
     * A findNumber metódus bemeneti paraméterként kap egy tömböt és egy számot.
     * A metódusod adja vissza a tömb azon indexét, ahol ez a szám először fordul elő!
     * Ha a tömbben nem szerepel ez a szám, a metódus visszatérési értéke legyen -1.
     * (4 pont)
     */
    public static int findNumber(int[] array, int number) {
        public static int findNumber(int[] array, int number) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
            return -1;
        }

    /**
     * [4. Feladat]
     * Valósítsd meg a findMaxIndex metódust!
     * A metódus bemeneti paraméterként egy egész számokat tartalmazó tömböt kap.
     * Visszatérési értéke legyen a tömb azon indexe, amelyen a tömb legnagyobb értékű eleme található.
     * A bemeneti paraméterként kapott tömbre igaz, hogy minden eleme eltérő értékű. (Azaz csak egy maximuma van.)
     * (5 pont)
     */
    public static int findMaxIndex(int[] array) {
        return 0;
    }

    /**
     * [5. Feladat]
     * Valósítsd meg a countSameNumbers metódust!
     * A metódus két egészeket tartalmazó tömb paramétert kap,
     * és azt kell megszámolnia, hogy hány elem szerepel az első tömbből a második tömbben.
     * Ügyelj arra, hogy ha egy szám többször szerepel a második tömbben, akkor azt csak egynek számold!
     * Az első tömbben minden szám csak egyszer fordul elő, ám a második tömbre ez nem feltétlen igaz.
     *
     * Példa:
     *      int[] firstNumbers = {0, 1, 2, 3, 4};
     *      int[] secondNumbers = {5, 6, 5, 4, 4, 4, 3};
     *      megoldás: 2
     *      indoklás: mivel 2 szám szerepel az első tömbből a másodikban (a 3 és a 4)
     *
     * (6 pont)
     */
    public static int countSameNumbers(int[] firstNumbers, int[] secondNumbers) {
        return -1;
    }

    /**
     * [6. Feladat]
     * Akrosztichonoknak hívjuk azokat a verseket, amelyekben a sorok kezdőbetűi egy értelmes szöveget adnak ki.
     * A feladatod az, hogy megvalósítsd a decodeAcrostic metódust, ami bemenetként kap egy Stringekből álló tömböt és
     * visszaadja a tömb elemeinek első karaktereiből összefűzött Stringet. A metódusod NE írjon ki semmit, csak adja vissza
     * a Stringet!
     * Tipp: Stringek összefűzésére hasznélható a + operátor és a .concat() metódus is. Mivel a String immutable, ezért
     * nem elég szoveg.concat("masikSzoveg);-et írnunk, hanem szoveg = szoveg.concat("masikSzoveg);-re van szükség!
     * Egy sztringből adott indexen levő karakter kinyerésére használható a charAt() metódus illetve akár a substring()
     * metódus is.
     * <p>
     * (Példa 1.) Az alábbi bemenetre:
     * String[] sokSikert = {
     * "Hát látod, itt az első sor,",
     * "Alatta a második",
     * "Jó kis példát találtam ki nektek,",
     * "Remélem mindenki",
     * "Átmegy."
     * };
     * Az elvárt kimenet a tömb minden elemének első karakteréből összefűzött String: HAJRÁ
     * <p>
     * (Példa 2.) A magyar irodalomban a leghíresebb ilyen mű talán Kosztolányi Dezső - Nyár c. verse, amit barátjának,
     * Karinthy Frigyesnek írt. A sorok első betűit összeolvasva az jön ki, hogy "Nyald ki a seggem, Karinthy"! :)
     * A metódusod erre a bemenetre:
     * String[] vers = {
     * "Nyár,",
     * "A régi vágyam egyre jobban",
     * "Lobban,",
     * "De vár még, egyre vár.",
     * "Kár",
     * "Így késlekedned, mert az éj setétül.",
     * "Az élet",
     * "Siralmas és sivár",
     * "Enélkül.",
     * "Gigászi vágyam éhes, mint a hörcsög,",
     * "Görcsök",
     * "Emésztik s forró titkom mélye szörcsög.",
     * "Mostan hajolj feléje.",
     * "Közel a lázak kéjes éje.",
     * "Akarod?",
     * "Remegve nyújtsd a szájad és karod.",
     * "Itt ez ital illatja tégedet vár.",
     * "Nektár.",
     * "Te",
     * "Hűtelen, boldog leszel majd újra, hidd meg.",
     * "Idd meg."
     * };
     * Adja a követjező kimenetet: NALDKÍASEGGEMKARINTHI. (Mivel minden sornak csak az első karaktrét vesszük,
     * a megoldás N-nel, nem pedig NY-nyel fog kezdődni.)
     * (5 pont)
     **/
    public static String decodeAcrostic(String[] poem) {
        return null;
    }

    /**
     * [SZORGALMI - 7. Feladat]
     * SZORGALMI - Nem kell teljesíteni a 100% eléréséhez!
     *
     * A zoknijaimat mindig párban teszem a mosógépbe, ám a teregetésnél szomorúan tapasztalom,
     * hogy az egyik zoknim (és mindig csak az egyik zoknim) egyik párja unos-untalan elvész...
     * Micsoda rejtelem! Ám szerencsére nem kell feltárnod ezt a misztikus jelenséget.
     *
     * Valósítsd meg a findTheOneSock metódust, amely bemeneti paraméterként nem-negatív egész számokat tartalmazó tömböt kap
     * (szimbolizálva a zoknijaimat a teregetéskor), és visszatérési értéke a tömb azon értéke, amelynek nincsen párja a tömbben.
     * A tömbben a számok párosával szerepelnek - előfordulhat, hogy kétszer, négyszer, hatszor... vagy többször.
     * Ám egy, és mindig csak egy szám pár nélkül szerepel.
     * A metódusodnak ezt az egyedül, pár nélkül lévő számot kell visszaadnia.
     *
     * Példa1.:     a tömb: {30, 10, 30, 10, 30, 30, 20, 10, 30, 10, 30}
     *              megoldás: 20
     *              indoklás:
     *                  a számpárok: 30-30, 10-10, 30-30, 10-10, 30-30
     *                  pár nélküli: 20
     *
     * Példa2.:     a tömb: {56, 1, 33, 42, 0, 86, 42, 86, 1, 56, 0}
     *              megoldás: 33
     *              indoklás:
     *                  a számpárok: 56-56, 1-1, 42-42, 0-0, 86-86
     *                  pár nélküli: 33
     *
     * (6 pont)
     */
    public static int findTheOneSock(int[] socks) {
        return -1;
    }






}