package homework2;

class TV extends Controller {
    public TV(boolean power) {
        super(power);
    }

    @Override
    String getName() {
        return "TV";
    }
}
