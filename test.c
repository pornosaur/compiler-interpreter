integer ff(integer s, integer k, integer f) {
    return s+k+f;
}

integer a() {
    return 1+ff(2,8,5);
}

void test() {
  integer f = a();
}
