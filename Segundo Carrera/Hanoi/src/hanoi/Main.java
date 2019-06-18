package hanoi;

import java.util.Scanner;

/**
 * https://uatfsist.files.wordpress.com/2012/04/solucionado2.pdf
 * 
 * @author trigu
 *
 */
public class Main {
	static double cont = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int discos;
		System.out.println("Cuantos discos hay? ");
		discos = sc.nextInt();
		// Hanoi(discos,1,2,3);
		// System.out.println("Movimientos: " + cont);

		Pila t1 = new Pila();
		Pila t2 = new Pila();
		Pila t3 = new Pila();
		for (int ii = discos; ii != 0; ii--) {
			t1.push(ii);
		}
		int con1 = discos, con2 = 0, con3 = 0, cont = 1, pri, ant = 0;
		System.out.println(con1 + "\t" + con2 + "\t" + con3);// 0
		while (con1 != 0 || con2 != 0) {
			pri = Primero(t1, t2, t3);// 1
			if (cont % 2 == 1) {// 2
				ant = pri;// a
				switch (pri) {
				case 1:// 3
					if (con1 % 2 == 1) {// 5
						if (Hanoi(t1, t3)) {
							con1--;
							con3++;
							cont++;
						} // 4
					} else {
						if (Hanoi(t1, t2)) {
							con1--;
							con2++;
							cont++;
						} // 4
					}
					System.out.println("1.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
					break;
				case 2:// 3
					if (con2 % 2 == 1) {// 5
						if (Hanoi(t2, t3)) {
							con2--;
							con3++;
							cont++;
						}
					} // 4
					else {
						if (Hanoi(t1, t2)) {
							con2--;
							con3--;
							cont++;
						} // 4
					}
					System.out.println("2.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
					break;
				case 3:// 3
					if (con3 % 2 == 1) {// 5
						if (Hanoi(t3, t2)) {
							con3--;
							con2++;
							cont++;
						}
					} // 4
					else {
						if (Hanoi(t3, t1)) {
							con3--;
							con1--;
							cont++;
						} // 4
					}
					System.out.println("3.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
					break;
				}
			} else {
				switch (ant) {
				case 1:
					if (!t1.isEmpty()) {
						if (con1 % 2 == 1) {
							if (Hanoi(t1, t3)) {
								con1--;
								con3++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 3;
								} else {
									ant = 2;
								}
							}
						} else {
							if (Hanoi(t1, t2)) {
								con1--;
								con2++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 3;
								} else {
									ant = 2;
								}
							}
						}
						System.out.println("4.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
						break;
					} else {
						if (Primero(t1, t2, t3) == 2) {
							ant = 3;
						} else {
							ant = 2;
						}
						break;
					}
				case 2:
					if (!t2.isEmpty()) {
						if (con2 % 2 == 1) {
							if (Hanoi(t2, t3)) {
								con2--;
								con3++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 1;
								} else {
									ant = 3;
								}
							}
						} else {
							if (Hanoi(t2, t1)) {
								con2--;
								con1++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 1;
								} else {
									ant = 3;
								}
							}
						}

						System.out.println("5.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
						break;
					} else {
						if (Primero(t1, t2, t3) == 2) {
							ant = 1;
						} else {
							ant = 3;
						}
						break;
					}
				case 3:
					if (!t3.isEmpty()) {
						if (con3 % 2 == 1) {
							if (Hanoi(t3, t2)) {
								con3--;
								con2++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 1;
								} else {
									ant = 2;
								}
							}
						} else {
							if (Hanoi(t3, t1)) {
								con3--;
								con1++;
								cont++;
							} else {
								if (Primero(t1, t2, t3) == 2) {
									ant = 1;
								} else {
									ant = 2;
								}
							}
						}
						System.out.println("6.-" + con1 + "\t" + con2 + "\t" + con3 + " " + cont);// 0
						break;
					} else {
						if (Primero(t1, t2, t3) == 2) {
							ant = 1;
						} else {
							ant = 2;
						}
						System.out.println("No existe movimiento -- pasamos a la pila conveniente");
					}
				}
			}
		}
		while (!t3.isEmpty()) {
			System.out.println(t3.top());
			t3.pop();
		}
	}

	// 9
	static int Primero(Pila _1, Pila _2, Pila _3) {
		if (_1.top() == 1) {
			return 1;
		} else {
			if (_2.top() == 1) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	// 10
	public static boolean Hanoi(Pila pri, Pila des) {
		if (!pri.isEmpty()) {
			if (des.isEmpty()) {
				des.push(pri.top());
				pri.pop();
				return true;
			} else {
				if (pri.top() < des.top()) {
					des.push(pri.top());
					pri.pop();
					return true;
				}
			}
			return false;
		}
		return false;
	}
}
