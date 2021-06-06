package test;

import test.Moveable.*;

public class PushableAdapter implements Pushable {

    Moveable mv;
    Direction dir;

    public PushableAdapter(Moveable mv) {

        dir = null;
        this.mv = mv;
    }

    @Override
    public void push(int heading) {


        if (heading <= 134 && heading >= 45)
            this.mv.moveMe(dir.right);

        if (heading <= 314 && heading >= 225)
            this.mv.moveMe(dir.left);

        if (heading <= 224 && heading >= 135)
            this.mv.moveMe(dir.down);

        if ((heading <= 0 && heading <= 44) || (heading < 360 && heading <= 315))
            this.mv.moveMe(dir.up);

    }

}
