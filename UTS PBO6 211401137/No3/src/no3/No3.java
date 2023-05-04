// Soal No 3 :  Perbaiki codingan pada github yang sudah tertera pada file main.java
// Yogi Noviana 211401137 

package no3;

/**
 *
 * @author ASUS
 * 
 */


class Character{
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
    Character(String nama, int heal, String weapon, int attackP, int mana){ 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }
    void attack(){
        this.mana -=5; 
        System.out.println(this.nama+" menyerang si sotong");
        System.out.println("sotong terkena demage sebanyak "+this.attackP );

    }
    void demage(int attackP){
        System.out.println(this.nama+ "ucup terkena demage sebanyak" + attackP);
        this.heal -= attackP;
    }
    void print(){
        System.out.println("nama: "+ this.nama);  
        System.out.println("heal: "+ this.heal);
        System.out.println("weapon: "+ this.weapon);
        System.out.println("attack power: " + this.attackP);
        System.out.println("mana : " + this.mana);
    }
}

public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character character1 = new Character("Ucup",100,"pedang excalibur",5,100);
        character1.attack();
        character1.demage(10);
        character1.print();
    }
    
}
