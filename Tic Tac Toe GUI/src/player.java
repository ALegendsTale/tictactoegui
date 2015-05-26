import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class player {

	static int incturn = 0;
	static int player1 = 0;
	static int player2 = 0;
	static int robot = 0;

	static int bn1 = 0;
	static int bn2 = 0;
	static int bn3 = 0;
	static int bn4 = 0;
	static int bn5 = 0;
	static int bn6 = 0;
	static int bn7 = 0;
	static int bn8 = 0;
	static int bn9 = 0;

	static int b1pressed = 0;
	static int b2pressed = 0;
	static int b3pressed = 0;
	static int b4pressed = 0;
	static int b5pressed = 0;
	static int b6pressed = 0;
	static int b7pressed = 0;
	static int b8pressed = 0;
	static int b9pressed = 0;

	static JButton button[] = new JButton[9];

	static JButton b10 = new JButton("Restart?");
	static JButton b11 = new JButton("Vs Person?");
	static JButton b12 = new JButton("Vs Comp.?");
	static GridLayout design = new GridLayout(0, 3);
	static JPanel p1 = new JPanel();
	static JFrame frame = new JFrame();

	static int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0;
	static int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0;
	static int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
	static int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0, ff = 0, gg = 0, hh = 0,
			ii = 0;

	static JLabel l1 = new JLabel("Welcome to Tic Tac Toe");
	static JLabel l2 = new JLabel();
	static JLabel l3 = new JLabel("Mode = vs. Player");

	static void player1() {
		// Robot (X)
		if (incturn == 0 || incturn == 2 || incturn == 4 || incturn == 6
				|| incturn == 8) {
			player1 = 1;
		}
	}

	static void player2() {
		// Person (O)
		if (incturn == 1 || incturn == 3 || incturn == 5 || incturn == 7
				|| incturn == 9) {
			player2 = 1;
		}
	}

	static void player1w() {
		a1 = a + b + c;
		a2 = d + e + f;
		a3 = g + h + i;
		a4 = a + d + g;
		a5 = b + e + h;
		a6 = c + f + i;
		a7 = a + e + i;
		a8 = c + e + g;
		if (a1 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a2 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a3 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a4 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a5 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a6 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a7 == 3) {
			l1.setText("Player 1 wins!");
		}
		if (a8 == 3) {
			l1.setText("Player 1 wins!");
		}
	}

	static void player2w() {
		c1 = aa + bb + cc;
		c2 = dd + ee + ff;
		c3 = gg + hh + ii;
		c4 = aa + dd + gg;
		c5 = bb + ee + hh;
		c6 = cc + ff + ii;
		c7 = aa + ee + ii;
		c8 = cc + ee + gg;
		if (c1 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c2 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c3 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c4 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c5 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c6 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c7 == 3) {
			l1.setText("Player 2 wins!");
		}
		if (c8 == 3) {
			l1.setText("Player 2 wins!");
		}
	}

	static void robot() {
		int temp = incturn;
		if (incturn % 2 == 0 && !l1.getText().contains("wins")) {
			do {
				int randint;
				randint = 1 + (int) (Math.random() * ((9 - 1) + 1));
				if (b1pressed == 1) {
					bn1 = 1;
				} else if (b2pressed == 1) {
					bn2 = 2;
				} else if (b3pressed == 1) {
					bn3 = 3;
				} else if (b4pressed == 1) {
					bn4 = 4;
				} else if (b5pressed == 1) {
					bn5 = 5;
				} else if (b6pressed == 1) {
					bn6 = 6;
				} else if (b7pressed == 1) {
					bn7 = 7;
				} else if (b8pressed == 1) {
					bn8 = 8;
				} else if (b9pressed == 1) {
					bn9 = 9;
				}

				if (randint == 1 && b1pressed == 0) {
					button[0].doClick();
				} else if (randint == 2 && b2pressed == 0) {
					button[1].doClick();
				} else if (randint == 3 && b3pressed == 0) {
					button[2].doClick();
				} else if (randint == 4 && b4pressed == 0) {
					button[3].doClick();
				} else if (randint == 5 && b5pressed == 0) {
					button[4].doClick();
				} else if (randint == 6 && b6pressed == 0) {
					button[5].doClick();
				} else if (randint == 7 && b7pressed == 0) {
					button[6].doClick();
				} else if (randint == 8 && b8pressed == 0) {
					button[7].doClick();
				} else if (randint == 9 && b9pressed == 0) {
					button[8].doClick();
				}
			} while (temp == incturn
					&& !l1.getText().toLowerCase().contains("draw"));
		}
	}

	static void creategui() {
		l1.setSize(300, 10);
		b10.setBackground(Color.black);
		b11.setBackground(Color.black);
		b12.setBackground(Color.black);
		b10.setForeground(Color.white);
		b11.setForeground(Color.white);
		b12.setForeground(Color.white);

		ImageIcon icon = new ImageIcon(
				"C:\\Users\\Bischof\\Pictures\\Icons\\Autotypericon.ico");

		frame.setTitle("Tic Tac Toe");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 500);
		frame.setResizable(false);
		frame.setIconImage(icon.getImage());

		button[0].setBackground(Color.lightGray);
		button[1].setBackground(Color.lightGray);
		button[2].setBackground(Color.lightGray);
		button[3].setBackground(Color.lightGray);
		button[4].setBackground(Color.lightGray);
		button[5].setBackground(Color.lightGray);
		button[6].setBackground(Color.lightGray);
		button[7].setBackground(Color.lightGray);
		button[8].setBackground(Color.lightGray);

		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		Font font2 = new Font("SansSerif", Font.PLAIN, 20);
		Font font3 = new Font("SansSerif", Font.ITALIC, 13);

		button[0].setFont(font1);
		button[1].setFont(font1);
		button[2].setFont(font1);
		button[3].setFont(font1);
		button[4].setFont(font1);
		button[5].setFont(font1);
		button[6].setFont(font1);
		button[7].setFont(font1);
		button[8].setFont(font1);
		b10.setFont(font2);
		b11.setFont(font2);
		b12.setFont(font2);
		l1.setFont(font3);

		p1.setLayout(design);
		p1.add(button[0]);
		p1.add(button[1]);
		p1.add(button[2]);
		p1.add(button[3]);
		p1.add(button[4]);
		p1.add(button[5]);
		p1.add(button[6]);
		p1.add(button[7]);
		p1.add(button[8]);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		frame.add(p1);
	}

	static void actionlisteners() {
		button[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b1pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b1pressed = 1;
				}
				if (b1pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[0].setText("X");
						a = 1;
						if (robot != 1) {
							button[0].setBackground(Color.green);
						} else if (robot == 1) {
							button[0].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[0].setText("O");
						aa = 1;
						button[0].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b1pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b2pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b2pressed = 1;
				}
				if (b2pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[1].setText("X");
						b = 1;
						if (robot != 1) {
							button[1].setBackground(Color.green);
						} else if (robot == 1) {
							button[1].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[1].setText("O");
						bb = 1;
						button[1].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b2pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b3pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b3pressed = 1;
				}
				if (b3pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[2].setText("X");
						c = 1;
						if (robot != 1) {
							button[2].setBackground(Color.green);
						} else if (robot == 1) {
							button[2].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[2].setText("O");
						cc = 1;
						button[2].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b3pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b4pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b4pressed = 1;
				}
				if (b4pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[3].setText("X");
						d = 1;
						if (robot != 1) {
							button[3].setBackground(Color.green);
						} else if (robot == 1) {
							button[3].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[3].setText("O");
						dd = 1;
						button[3].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b4pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b5pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b5pressed = 1;
				}
				if (b5pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[4].setText("X");
						e = 1;
						if (robot != 1) {
							button[4].setBackground(Color.green);
						} else if (robot == 1) {
							button[4].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[4].setText("O");
						ee = 1;
						button[4].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b5pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b6pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b6pressed = 1;
				}
				if (b6pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[5].setText("X");
						f = 1;
						if (robot != 1) {
							button[5].setBackground(Color.green);
						} else if (robot == 1) {
							button[5].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[5].setText("O");
						ff = 1;
						button[5].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b6pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b7pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b7pressed = 1;
				}
				if (b7pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[6].setText("X");
						g = 1;
						if (robot != 1) {
							button[6].setBackground(Color.green);
						} else if (robot == 1) {
							button[6].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[6].setText("O");
						gg = 1;
						button[6].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b7pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b8pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b8pressed = 1;
				}
				if (b8pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[7].setText("X");
						h = 1;
						if (robot != 1) {
							button[7].setBackground(Color.green);
						} else if (robot == 1) {
							button[7].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[7].setText("O");
						hh = 1;
						button[7].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b8pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		button[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if (a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
						|| a6 == 3 || a7 == 3 || a8 == 3) {
					b9pressed = 1;
				}
				if (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3
						|| c6 == 3 || c7 == 3 || c8 == 3) {
					b9pressed = 1;
				}
				if (b9pressed == 0) {
					incturn++;
					if (player1 == 1) {
						button[8].setText("X");
						i = 1;
						if (robot != 1) {
							button[8].setBackground(Color.green);
						} else if (robot == 1) {
							button[8].setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1) {
						button[8].setText("O");
						ii = 1;
						button[8].setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")) {
						l1.setText("It's a draw!");
					}
				}
				b9pressed = 1;
				player1 = 0;
				player2 = 0;
				if (robot == 1) {
					robot();
				}
			}
		});
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				creategui();
				setup();
			}
		});
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l3.setText("Mode = vs. Player");

				for (int i = 0; i <= 8; i++) {
					if (button[i].getBackground().equals(Color.gray)
							&& player2 == 0) {
						button[i].setBackground(Color.green);
					}
				}

				robot = 0;
			}
		});
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l3.setText("Mode = vs. Computer");
				for (int i = 0; i <= 8; i++) {
					if (button[i].getBackground().equals(Color.green)
							&& player2 == 0) {
						button[i].setBackground(Color.gray);
					}
					robot = 1;
					robot();
				}

			}
		});

	}

	static void setup() {
		b1pressed = 0;
		b2pressed = 0;
		b3pressed = 0;
		b4pressed = 0;
		b5pressed = 0;
		b6pressed = 0;
		b7pressed = 0;
		b8pressed = 0;
		b9pressed = 0;
		incturn = 0;
		button[0].setText("");
		button[1].setText("");
		button[2].setText("");
		button[3].setText("");
		button[4].setText("");
		button[5].setText("");
		button[6].setText("");
		button[7].setText("");
		button[8].setText("");
		l1.setText("The game was reset.");
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		g = 0;
		h = 0;
		i = 0;
		aa = 0;
		bb = 0;
		cc = 0;
		dd = 0;
		ee = 0;
		ff = 0;
		gg = 0;
		hh = 0;
		ii = 0;
		a1 = 0;
		a2 = 0;
		a3 = 0;
		a4 = 0;
		a5 = 0;
		a6 = 0;
		a7 = 0;
		a8 = 0;
		c1 = 0;
		c2 = 0;
		c3 = 0;
		c4 = 0;
		c5 = 0;
		c6 = 0;
		c7 = 0;
		c8 = 0;
		if (robot == 1) {
			robot();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 8; i++) {
			button[i] = new JButton("");
		}
		creategui();
		frame.setLocationRelativeTo(null);
		actionlisteners();
	}

	{
	}
	{
	}
}