package Day_44_Encapsulation_2;

public class Printer {

   private int tonerLevel;
   private int pagePrinted;
   private boolean duplex;

    public Printer() {
    }

    public Printer(boolean duplex, int tonerLevel){
       if(tonerLevel>0 && tonerLevel<100){
           this.tonerLevel =tonerLevel;
       }else {
           this.tonerLevel =0;
       }
       this.duplex=duplex;
       this.pagePrinted=0;
   }
    public int tonerAdd(int tonnerAmount,int tonerLavel){
        if(tonnerAmount>-1 && tonnerAmount<=100){
            //This kullanilarak condition yazilabilir.
            if(this.tonerLevel +tonnerAmount>0 && this.tonerLevel +tonnerAmount<100)
                     this.tonerLevel =tonerLavel;

        }else {
         return    this.tonerLevel =-1;
        }
        return -1;
    }


    public int printPages(int pages){
        int pagetoPrinted=pages;

        if(this.duplex){
            pagetoPrinted=(pages/2)+(pages%2);

        }
        this.pagePrinted+=pagetoPrinted;
        return pagetoPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
