package demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by Roger on 28/10/2015.
 */
public class Tall {
    @Min(1)
    @Max(100)
    private int tall1;
    @Min(1)
    @Max(100)
    private int tall2;

    public int getTall1() {
        return tall1;
    }

    public void setTall1(int tall1) {
        this.tall1 = tall1;
    }

    public int getTall2() {
        return tall2;
    }

    public void setTall2(int tall2) {
        this.tall2 = tall2;
    }

    public int getSum(){
        return tall1 + tall2;
    }
}
