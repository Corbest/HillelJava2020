package HM17;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bank {
    public int fullness = 0;
    public int max_size = 1000;
    public int min_size = 0;

    public int check() {
        return this.fullness;
    }
    public int inPutForBank(int inPut) {
        if( check() < max_size) {
            fullness += inPut;
            return inPut;
        }else
            System.out.println("Банкомат полон");
            return -1;
    }

    public int outPutForBank(int outPut) {
        if( outPut > min_size) {
            fullness -= outPut;
            return outPut;
        }else
            System.out.println("Банкомат пуст");
        return -1;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.check());
        System.out.println(bank.inPutForBank(10));
        System.out.println(bank.check());
    }
}
