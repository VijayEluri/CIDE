class Main {
	void foo() {
		a(1);
		if (true) {
			int i = 0;
			a(i + 2);
			try {
				a(i + 3);
			} finally {
			}
			a(i + 4);
		}
		a(5);
	}

	void bar() {
		a(1);
		if (true) {
			int i = 1;
			a(i + 2);
			try {
				a(i + 3);
			} finally {
			}
			a(i + 4);
		}
		a(5);
	}

	void a(int x) {
	}

}
