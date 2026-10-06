package homework2;

class Radio extends Controller {
    public Radio(boolean power) {
        super(power);
    }

    @Override
    String getName() {
        return "라디오";
    }
}
