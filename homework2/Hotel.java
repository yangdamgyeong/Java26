package homework2;

class Hotel {
    private class Room {
        int roomNumber;
        String guestName;

        Room(int roomNumber, String guestName) {
            this.roomNumber = roomNumber;
            this.guestName = guestName;
        }
    }

    private java.util.List<Room> rooms = new java.util.ArrayList<>();

    public void add(int roomNumber, String guestName) {
        rooms.add(new Room(roomNumber, guestName));
    }

    public void show() {
        for (Room r : rooms) {
            System.out.println(r.roomNumber + "번 방을 " + r.guestName + "이 예약했습니다.");
        }
    }
}
