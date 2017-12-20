integer f(integer f) {
    return f + 2;
}

integer a(integer f) {
    integer a = 5;
    if (f == 1) {
        a = a + f(2);
    }

    return a;
}

integer test() {
  integer f = a(1);
}
