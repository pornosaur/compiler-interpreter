void a(integer f) {
    if (f < 3) {
        integer k = 3;
    } else {
        integer i = 10;
        return i;
    }

    a(f+1);
}

integer test() {
  integer f = a(1);
}
