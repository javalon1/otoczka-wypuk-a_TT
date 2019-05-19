package com.sda.algorytmy;
class Punkt {
    int x,y;
    boolean b;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
        b=true;
    }
    void przedstawsię()
    {
        System.out.println(this.x + " " + this.y + " " + this.b);
    }
}

public class App {



    public static void main( String[] args )
    {
        Punkt p1 = new Punkt(1,2);
        Punkt p2 = new Punkt(5,2);
        Punkt p3 = new Punkt(1,6);
        Punkt p4 = new Punkt(5,6);
        Punkt p5 = new Punkt(15,100);
        Punkt p6 = new Punkt(3,3);
        Punkt p7 = new Punkt(4,2);
        Punkt p8 = new Punkt(2,3);
        Punkt p9 = new Punkt(0,3);
        Punkt p10 = new Punkt(4,7);

        int ilosc = 10;

        Punkt [] tablicaPunktow = new Punkt[ilosc];
                tablicaPunktow[0]=p1;
                tablicaPunktow[1]=p2;
                tablicaPunktow[2]=p3;
                tablicaPunktow[3]=p4;
                tablicaPunktow[4]=p5;
                tablicaPunktow[5]=p6;
                tablicaPunktow[6]=p7;
                tablicaPunktow[7]=p8;
                tablicaPunktow[8]=p9;
                tablicaPunktow[9]=p10;

        Punkt [] stos = new Punkt[ilosc];

        stos[0]=skrajnyPunkt(tablicaPunktow);

        stos[1]=drugiPunkt(tablicaPunktow,stos[0]);


        System.out.println(stos[0].x+" "+stos[0].y);
        System.out.println(stos[1].x+" "+stos[1].y);
        stos[0].b=true;
        stos[1].b=false;


        p1.przedstawsię();
        p2.przedstawsię();
        p3.przedstawsię();
        p4.przedstawsię();
        p5.przedstawsię();
        p6.przedstawsię();
        p7.przedstawsię();
        p8.przedstawsię();
        p9.przedstawsię();
        p10.przedstawsię();

    }
        public static Punkt skrajnyPunkt(Punkt[] tab){
        Punkt tmp = tab[0];
        for (int i = 1; i<tab.length;i++){
                if(tab[i].x<tmp.x||tab[i].y<tmp.y){
                    tmp = tab[i];

                }
            }return tmp;
        }

        public static Punkt drugiPunkt(Punkt[] tab, Punkt pierwszyPunktObwiedni){
        Punkt punkt2=tab[0];
        Punkt punkt3;
        int wyznaczznik;

        for(int i=0; i<tab.length;i++){
                if (tab[i].x==pierwszyPunktObwiedni.x && tab[i].y==pierwszyPunktObwiedni.y){
                    tab[i].b=false;
                }
            }

        for (int i=0;i<tab.length;i++){
            if(tab[i].b==true){
                punkt2=tab[i];
                for(int j=i+1; j<tab.length;j++){
                    if(tab[j].b==true){
                        punkt3=tab[j];
                        wyznaczznik=wyznacznik(pierwszyPunktObwiedni,punkt2,punkt3);

                        if(wyznaczznik<0){
                            punkt2=punkt3;
                            i=j;
                        }

                    }else;

                }  return punkt2;

            }else;
        }
            return punkt2;

        }

        public static int wyznacznik(Punkt pierwszyPunkt, Punkt drugiPunkt, Punkt trzeciPunkt){
        return (pierwszyPunkt.x*drugiPunkt.y+drugiPunkt.x*trzeciPunkt.y+trzeciPunkt.x*pierwszyPunkt.y-drugiPunkt.y*trzeciPunkt.x-trzeciPunkt.y*pierwszyPunkt.x-pierwszyPunkt.y*drugiPunkt.x);
        }

        public static void kolejnePunkty (Punkt [] tab, Punkt [] stos, Punkt pierwszyPunkt){
            for(int i=0; i<tab.length;i++){
                if (tab[i].x==pierwszyPunkt.x && tab[i].y==pierwszyPunkt.y){
                    tab[i].b=true;
                }
            }
        for(int i = 2; i<stos.length; i++){

        }
        }

        public static void wyświetlPunkty(){
        }
}
