integer ff(integer s, integer k) {
    return s+k;
}

integer a(integer f, integer g, integer c) {
    integer ch = ff(2, 8);
    return 1 + f + g + c + ch;
}

void test() {
   a(1, 2, 3);
}
