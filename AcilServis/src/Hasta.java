
public class Hasta implements Comparable<Hasta>{
    private String isim ;
    private String sikayet ;
    private int oncelik ;
    
    public Hasta(String isim,String sikayet ){
        this.isim = isim;
        this.sikayet = sikayet;
        if(sikayet.equals("Apandisit")){
            this.oncelik = 85 ;
        }else if(sikayet.equals("Yanık")){
            this.oncelik = 58;
            
        }else{
            this.oncelik = 44;
        }
        
    }

    @Override
    public String toString() {
        //return "Hasta{" + "isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + '}';
        String bilgiler = " Hasta adı : "+isim +
                "\n Şikayet :" +sikayet +
                "\n Öncelik :" +oncelik;
        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(this.oncelik>hasta.oncelik){
           return -85;
       }else if(this.oncelik<hasta.oncelik){
           return 85;
       }else{
            return 0;
       }
      
    }
    
    
}
