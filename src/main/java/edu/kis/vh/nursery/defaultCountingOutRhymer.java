package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    /**
     * Stała MAX_SIZE przyjmuje wartosc 12
     * okresla maksymalna wielkosc tablicy
     */
    public static final int MAX_SIZE = 12;

    /**
     * Stała INDEX przyjmuje wartosc 11
     * okresla maksymalny indeks tablicy
     */
    public static final int INDEX = MAX_SIZE - 1;

    /**
     * Stała DEFAULT przyjmuje wartosc -1
     * jest to domyslna wartosc bledu ktora funkcja zwraca w tej klasie
     */

    public static final int DEFAULT = -1;

    /**
     * Tablica Numbers
     * jest to zaalokowana tablicą 12 liczb typu int
     */
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int totalNumbers = -1;

    /**
     * @param in countIn
     *           funkcja dodaje liczbe podaną jako int do tablicy jezeli ta nie jest pelna
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++totalNumbers] = in;
    }

        public boolean callCheck() {
            return totalNumbers == DEFAULT;
        }

    /**
     * @return
     * isFull
     * zwraca prawde jezeli tablica jest pelna
     * falsz jezeli ilosc elementow jest mniejsza od 12
     */
            public boolean isFull() {
                return totalNumbers == INDEX;
            }

    /**
     * @return
     * peekaboo
     * zwraca ostatni dodany do tablicy element
     */
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT;
                    return NUMBERS[totalNumbers];
                }

    /**
     * countOut
     * funkcja zwraca i usuwa ostatni element dodany do tablicy
     */
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT;
                        return NUMBERS[totalNumbers--];
                    }

}
