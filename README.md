# RMA_LV2

Zadatak 1. 
Kreirajte aplikaciju koja omogućuje prikaz informacija o inspirirajućim osobama iz svijeta računarstva. Svaka osoba predstavljena je objektom klase InspiringPerson. Aplikacija mora imati dva ekrana, jedan koji omogućuje unos nove osobe i drugi koji omogućuje prikaz svih osoba unutar skrolajuće liste. Koristiti RecyclerView kontrolu za prikaz liste osoba. Osobe držati u memoriji. Prikaz unutar liste treba prikazati sliku osobe, datum rođenja i eventualno smrti, te kratak opis (1-2 rečenice). Klik na sliku osobe treba prikazati nasumičan citat te osobe.
Pomoć: Osobe možete čuvati u object singletonu naziva PeopleRepository koji unutar sebe ima instancu MutableList klase. Na repozitoriju omogućiti dodavanje nove osobe.

Zadatak 2. 
Riješite zadatak 1. korištenjem fragmenata. Omogućite brisanje osoba iz liste te uređivanje informacija o osobama u listi.
Pomoć: Možete koristiti Viewpager s dva taba, jedan za prikaz postojećih, drugi za kreiranje novih. Ili možete raditi s FragmentManagerom pa učitavati odgovarajuće fragmente u kontejnerski layout manager unutar Vašeg Activitya. U potonjem slučaju koristite Action gumb za dodavanje nove osobe.
Pomoć: Za uređivanje možete koristiti već postojeći view, samo morate poslati id objekta prilikom otvaranja tog viewa kako bi se učitala postojeća osoba iz repozitorija.
