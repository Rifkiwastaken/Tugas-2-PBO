public class App {

    public static void main(String[] args) {

        Asdos a = new Asdos("harley", 23, 4);

        Dosen b = new Dosen("dedi", 5);

        Asdos c = new Asdos("irnanto", 20, 4);

        Mahasiswa d = new Mahasiswa("sari", 20);

        Mahasiswa e = new Mahasiswa("puji to Pass this sem", 23);

        Dosen f = new Dosen("noval", 3);

        

        

        a.output();

        b.output();

        c.output();

        d.output();

        e.output();

        f.output();

        int totalJamSibuk = a.getJamSibuk() + b.getJamSibuk() + c.getJamSibuk() + d.getJamSibuk() + e.getJamSibuk() + f.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);

    }

    

}

class Dosen extends Elemen {// merupakan polymorphism karena turunan dari class induk

    public int JAMSIBUK;

    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {

        super(nama);//super merupakan DOWNCASTING karena mewariskan dari parent (Elemen) ke child (Dosen)

        JAMSIBUK = jumlahHariKerja * 8;

    }

    public void output() {

        System.out.println(nama + " adalah seorang dosen dengan jam sibuk" + " " + JAMSIBUK);

    }

    public int getJamSibuk() {

        return JAMSIBUK;

    }

}

class Mahasiswa extends Elemen {// merupakan polymorphism karena turunan dari class induk

    private int SKS;

    public int JAMSIBUK;

    public Mahasiswa(String nama, int SKS) {

        super(nama);//super merupakan DOWNCASTING karena mewariskan dari parent (Elemen) ke child (mahasiswa)

        JAMSIBUK = SKS * 3;

    }

    public int getJamSibuk() {

        return JAMSIBUK;

    }

    public void output() {

        System.out.println(nama + " adalah seorang Mahasiswa dengan jam sibuk " + " " + JAMSIBUK);

    }

}

class Asdos extends Mahasiswa {// merupakan polymorphism karena turunan dari class induk

    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos) {

        super(nama, SKS);//super merupakan DOWNCASTING karena mewariskan dari parent (Mahasiswa) ke child (Asdos)

        JAMSIBUK = JAMSIBUK + jamNgasdos;

    }

    public int getJamSibuk() {

        return JAMSIBUK;

    }

    public void output() {

        /*

         * merupakan UPCASTING,karena melakukan

         * perubahan isi method yang ada pada superclassnya

         */

        System.out.println(nama + " adalah seornagsdos dengan jam sibu " + " " + JAMSIBUK);

    }

    {

    

}

}
