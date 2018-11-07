# Task 2
Second learning task from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Task description (Czech language only)

### Co je potřeba znát

Rozumět pojmům rozhraní, konstruktor, přetěžování metod/konstruktorů, cyklus while, práce (porovnání) s `null`.

### Popis úlohy

Úloha simuluje jízdu tramvají z pohledu cestujícího a řidiče.

Žádnou z předdefinovaných tříd/rozhraní neměňte!

### Zadání pro cvičení (3 body)

-   Vytvořte třídu `Tram` implementující rozhraní `PublicTransport`.
    Rozhraní zachycuje situaci, kdy dopravní prostředek jezdí mezi dvěma
    koncovými zastávkami. Třída `Tram` bude mít konstruktor se dvěma
    parametry typu `String` se jmény koncových stanic. Implicitní směr
    jízdy je od první stanice (první parametr) do druhé.
-   Vytvořte třídu `Passenger` představující cestujícího. Třída bude mít
    následující metody:
    -   `getOn` pro nastoupení do dopravního prostředku. Dopravní
        prostředek je dán jako parametr metody. Pokud je již cestující v
        nějaké dopravním prostředku, metoda nedělá nic a vrací `false`,
        jinak vrací `true`.
    -   `getOff` pro vystoupení z dopravního prostředku, ve kterém
        cestující právě nyní jede. Pokud cestující v žádném dopravním
        prostředku není, metoda vrací `false`, jinak vrací `true`.
    -   `toString`, která vrátí textový řetězec `"I'm not travelling"`
        pokud cestující není v žádném dopravním prostředku. V opačném
        případě vrátí `"Travelling towards <to>"`, kde `"<to>"` je název
        cílové stanice.
-   Vytvořte třídu `Demo` spustitelnou z příkazového řádku. Třídy
    provede tyto kroky:

    -   Vytvoří tramvaj s koncovými zastávkami `"Bystrc-Ecerova"` a
        `"Reckovice"`.
    -   Vytvoří cestujícího.
    -   Nechá cestujícího nastoupit do tramvaje a poté vypíše na std.
        výstup informace o cestujícím, viz metoda `toString()`.
    -   Změní směr tramvaje (tramvaj dojela na konečnou) a poté vypíše
        na std. výstup informace o cestujícím.
    -   Nechá cestujícího vystoupit a poté vypíše na std. výstup
        informace o cestujícím.
    -   Při správném řešení by se měl na výstupu objevit následující text:

        Travelling towards Reckovice
        Travelling towards Bystrc-Ecerova
        I'm not travelling  

### Zadání na doma (3 body)

-   Upravte třídu `Tram` podle následujících instrukcí:
    -   Třída bude implementovat také rozhraní `Driveable`
    -   Upravte existující konstruktor tak, aby vytvořil tramvaj s
        maximální rychlostí 50km/h.
    -   Vytvořte nový konstruktor tak, aby šlo vytvořit tramvaj s
        libovolnou maximální rychlostí (v případě, že bude konstruktor
        zavolán s nekladnou rychlostí, nastavte rychlost na 50km/h).
    -   V kódu se nebude přímo pracovat s hodnout 50km/h, ale tato
        hodnota bude definována jako konstanta třídy `Tram`.
    -   Metoda `toString()` bude vracet řetězec tvaru:

            Tram: <X> km/h

        `<X>` je číslo představující aktuální rychlost tramvaje.

-   Vytvořte třídu `Driver` představující řidiče. Třída bude mít
    konstruktor, který řidiči nastaví libovolný řiditelný dopravní
    prostředek, a následující metody:
    -   `void straightaway()`: jízda na rovince - řidič zrychlí na
        maximální možnou rychlost.
    -   `void carefully()`: opatrná jízda - řidič zpomalí na polovinu
        aktuální rychlosti (zaokrouhleno dolů).
    -   `void stop()`: řidič zastaví.

    Ve všech těchto metodách bude řidič manipulovat s přiděleným
    dopravním prostředkem. Třída `Driver` tedy bude používat metody
    definované rozhraním `Driveable`.
-   Upravte metodu třídy `Demo` tak, aby fungovala podle následující
    specifikace:
    -   Třída vytvoří tramvaj s koncovými zastávkami `"Bystrc-Ecerova"`
        a `"Reckovice"` a s maximální rychlostí 100km/h a dále vytvoří
        řidiče.
    -   Řidič
        -   nejprve jede na rovince;
        -   jede opatrně;
        -   jede ještě opatrněji;
        -   pojede na rovince;
        -   zastaví.
    -   Po každé změně rychlosti vypište na std. výstup pomocí metody
        `toString()` stav tramvaje. Při správném řešení by se měl na
        výstupu objevit následující text:

            Tram: 100 km/h
            Tram: 50 km/h
            Tram: 25 km/h
            Tram: 100 km/h
            Tram: 0 km/h

-   Třídy `Tram`, `Passenger` a `Driver` zdokumentujte pomocí JavaDoc.
    Metody předepsané rozhraními není třeba dokumentovat.

## License
MIT