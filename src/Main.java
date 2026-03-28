void main() {
    // uložení informací o prodejci a vytvoření prodejce1 a prodejce2 z class
    prodejceMrkve prodejce1 = new prodejceMrkve();
    prodejce1.jmeno = "Jan Novák";
    prodejce1.datumNarozeni = LocalDate.of(1990, 1, 1);
    prodejce1.pocetSmluv = 10;
    prodejce1.mrkevTuny = 150;
    prodejce1.senior = false;

    prodejceMrkve prodejce2 = new prodejceMrkve();
    prodejce2.jmeno = "Marie Černá";
    prodejce2.datumNarozeni = LocalDate.of(1975, 2, 13);
    prodejce2.pocetSmluv = 68;
    prodejce2.mrkevTuny = 658;
    prodejce2.senior = true;

    // výpis jmen v konzoli
    System.out.println("První prodejce je " + prodejce1.jmeno);
    System.out.println("Jméno druhého prodejce je " + prodejce2.jmeno);
}
