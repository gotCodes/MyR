		package Howard;
		import java.util.Random;
		import java.util.Scanner;
		
		public class well {
			public void Try(){
				Random rand = new Random();
				Scanner in = new Scanner(System.in);

				String[] enemies = { "Grunt", "Goblin", "Troll", "Zombie" };
				String[] weapons = { "Bronze Spear", "Iron Warhammer", "Steel Mace", "Diamond Sword" };

				int bronze = 0;
				int iron = 1;
				int steel = 2;
				int diamond = 3;

				int bronzeDrop = 40; // Use <
				int lowIronDrop = 40; // Use >
				int highIronDrop = 70; // Use <
				int lowSteelDrop = 70; // Use >
				int highSteelDrop = 90; // Use <
				int diamondDrop = 90; // Use >

				int bronzeDamage = 5;
				int ironDamage = 15;
				int steelDamage = 25;
				int diamondDamage = 45;

				int lives = 3;

				String weapon;

				int weaponDropChance = 75;
				int weaponDamage = 0;

				int fireBall = 3;
				int maxFireBall = 3;
				int iceShard = 3;
				int maxIceShard = 3;
				int cheese = 3;
				int maxCheese = 3;


				int maxGruntHealth = 50;
				int maxGruntAttack = 50;
				int maxGoblinHealth = 25;
				int maxGoblinAttack = 75;
				int maxTrollHealth = 80;
				int maxTrollAttack = 25;
				int maxZombieHealth = 75;
				int maxZombieAttack = 60;

				int playerHealth = 100;
				int maxPlayerAttack = 50;
				int maxPlayerHealth = 100;
				int levelUp = 0;
				int level1 = 25;
				int level1P = 1;
				int level2 = 30;
				int level2P = 1;
				int level3 = 35;
				int level3P = 1;
				int level4 = 40;
				int level4P = 1;
				int level5 = 45;
				int level5P = 2;
				int level6 = 50;
				int level6P = 2;
				int level7 = 50;
				int level7P = 2;
				int level8 = 50;
				int level8P = 2;
				int level9 = 100;
				int level9P = 3;
				int level10 = 100;
				int level10P = 3;

				int healthPotionDrop = 45;
				int healthPotion = 5;
				int healthPotionAmount = 25;
				int maxHPotionAmount = 5;

				int ultPotDrop = 15;
				int ultPot = 0;
				int ultPotAmt = 50;
				int maxUPotionAmount = 5;

				int bodyCount = 0;

				boolean keeperGoin = true;
			}

			public static void main(String[] args) {


			// how to keep variables
			//while loop on spells
			//fix death thing
			
				well a = new well();
				a.Well();
			}
			

			private void Well() {
				Try();
				MainGame: while (keeperGoin) {

					int bruh = rand.nextInt(enemies.length);
					String enemy = enemies[bruh];
					int enemyHealth;

					if (bruh == 0) {
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\t***" + enemy + " has appeared!***");
						enemyHealth = rand.nextInt(maxGruntHealth);


						while (enemyHealth > 0) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tYour Hp: **" + playerHealth + "**");
							System.out.println("\t\t" + enemy + "'s Hp: **" + enemyHealth + "**");
							System.out.println("\t\t��What would you like to do??");
							System.out.println(
									"\t\t[1] Attack \n\t\t[2] Use Potion \n\t\t[3] Use Ultimate Potion \n\t\t[4] Run \n\t\t[5] Use Spells");

							String input = in.nextLine();

							if (input.equals("1")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

								int playerDamage = rand.nextInt(maxPlayerAttack);
								int totalPlayerDamage = playerDamage + weaponDamage;

								int enemyDamage = rand.nextInt(maxGruntAttack);

								enemyHealth -= totalPlayerDamage;
								playerHealth -= enemyDamage;

								System.out.println("\t\tYou strike " + enemy + " for " + playerDamage + " and " + weaponDamage);
								System.out.println("\t\tYou take " + enemyDamage + " from the " + enemy);

								if (playerHealth < 1) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tThe " + enemy + " has defeated you.");

									break;
								}

							}

							else if (input.equals("2")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								if (healthPotion > 0) {

									playerHealth += healthPotionAmount;
									healthPotion--;

									System.out.println("\t\tYou have healed " + healthPotionAmount + " Hp");
									System.out.println("\t\tYou have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + healthPotion + " health potions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no health potions left");

								}

							}

							else if (input.equals("3")) {
								if (ultPot > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									playerHealth += ultPotAmt;
									ultPot--;

									System.out.println("\t\tYou have healed " + ultPotAmt + " Hp");
									System.out.println("\t\tYour have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + ultPot + " ultimate \n\t\tpotions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no ultimate \n\t\tpotions left");

								}

							}

							else if (input.equals("4")) {
								if (lives > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have ran from the enemy!"
											+ "\n\t\tYou restart the maze \n\t\twith full health and potions,"
											+ "\n\t\tBut you lose a life.");
									lives--;
									healthPotion = 5;
									playerHealth = maxPlayerHealth;
									fireBall = maxFireBall;
									iceShard = maxIceShard;
									cheese = maxCheese;
									continue MainGame;
								} else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou can not run \n\t\tyou are out of lives!");
								}

							}

							else if (input.equals("5")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tWhich spell would \n\t\tyou like to use?");
								System.out.println("\t\t[1] Fireball \n\t\t[2] Ice Shard \n\t\t[3] Cheese???");
								String input1 = in.nextLine();

								if (input1.equals("1")) {
									if (fireBall > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a fireball \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " is burnt \n\t\tand takes heavy damage");
										enemyHealth -= 150;
										fireBall--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Fireballs");
									}

								}

								else if (input1.equals("2")) {
									if (iceShard > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a ice shard \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " \n\t\ttakes heavy damage");
										enemyHealth -= 150;
										iceShard--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Ice Shards");
									}
								}

								else if (input1.equals("3")) {
									if (cheese > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tCHEEESSE FOR EVERYONE!!! \n\t\tAHAHAHA!!!!");
										System.out.println("\t\tThe " + enemy + " is pummeled \n\t\tby giant cheese meteors");
										enemyHealth -= 150;
										cheese--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more CHEEEESSSEEE");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tSorry wrong input");
								}

							}

							else {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tSorry Wrong Input!");

							}

						}

						if (playerHealth < 1) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tYou Died2");
							break;
						}

						if (enemyHealth < 1) {
							bodyCount++;
						}
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\tYou defeated The " + enemy);
						System.out.println("\t\tYour Hp: " + playerHealth);
						System.out.println("\t\tYour body count is " + bodyCount);

						if (bodyCount == 10) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level1;
							maxHPotionAmount += level1P;
							System.out.println("\t\tYou Gain " + level1 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;

						}

						if (bodyCount == 20) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level2;
							maxHPotionAmount += level2P;
							System.out.println("\t\tYou Gain " + level2 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 30) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level3;
							maxHPotionAmount += level3P;
							System.out.println("\t\tYou Gain " + level3 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 40) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level4;
							maxHPotionAmount += level4P;
							System.out.println("\t\tYou Gain " + level4 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 50) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level5;
							maxHPotionAmount += level5P;
							System.out.println("\t\tYou Gain " + level5 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 65) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level6;
							maxHPotionAmount += level6P;
							System.out.println("\t\tYou Gain " + level6 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 80) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level7;
							maxHPotionAmount += level7P;
							System.out.println("\t\tYou Gain " + level7 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 95) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level8;
							maxHPotionAmount += level8P;
							System.out.println("\t\tYou Gain " + level8 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 110) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level9;
							maxHPotionAmount += level9P;
							System.out.println("\t\tYou Gain " + level9 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 125) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level10;
							maxHPotionAmount += level10P;
							System.out.println("\t\tYou Gain " + level10 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (healthPotion < maxHPotionAmount) {
							if (rand.nextInt(100) < healthPotionDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								healthPotion++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\ta health potion");
								System.out.println("\t\tYou now have \n\t\t" + healthPotion + " health potions");

							}
						}

						if (ultPot < maxUPotionAmount) {
							if (rand.nextInt(100) < ultPotDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								ultPot++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\tan ultimate health potion");
								System.out.println("\t\tYou now have \n\t\t" + ultPot + " ultimate health potions");

							}
						}

						if (rand.nextInt(100) < weaponDropChance) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tThe " + enemy + " has dropped a weapon.");
							int enemyWeaponDrop = rand.nextInt(100);

							while (true) {

								if (enemyWeaponDrop <= bronzeDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[bronze];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input = in.nextLine();

									if (input.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += bronzeDamage;
										break;
									}

									else if (input.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowIronDrop && enemyWeaponDrop <= highIronDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[iron];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input1 = in.nextLine();

									if (input1.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += ironDamage;
										break;
									}

									else if (input1.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowSteelDrop && enemyWeaponDrop <= highSteelDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[steel];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input2 = in.nextLine();

									if (input2.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += steelDamage;
										break;
									}

									else if (input2.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

								else if (enemyWeaponDrop >= diamondDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[diamond];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input3 = in.nextLine();

									if (input3.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += diamondDamage;
										break;
									}

									else if (input3.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

							}
						}

					}

					else if (bruh == 1) {
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\t***" + enemy + " has appeared!***");
						enemyHealth = rand.nextInt(maxGoblinHealth);

						while (enemyHealth > 0) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tYour Hp: **" + playerHealth + "**");
							System.out.println("\t\t" + enemy + "'s Hp: **" + enemyHealth + "**");
							System.out.println("\t\t��What would you like to do??");
							System.out.println(
									"\t\t[1] Attack \n\t\t[2] Use Potion \n\t\t[3] Use Ultimate Potion \n\t\t[4] Run \n\t\t[5] Use Spells");

							String input = in.nextLine();

							if (input.equals("1")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

								int playerDamage = rand.nextInt(maxPlayerAttack);
								int totalPlayerDamage = playerDamage + weaponDamage;

								int enemyDamage = rand.nextInt(maxGoblinAttack);

								enemyHealth -= totalPlayerDamage;
								playerHealth -= enemyDamage;

								System.out.println("\t\tYou strike " + enemy + " for " + playerDamage + " and " + weaponDamage);
								System.out.println("\t\tYou take " + enemyDamage + " from the " + enemy);

								if (playerHealth < 1) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tThe " + enemy + " has defeated you.");

									break;
								}

							}

							else if (input.equals("2")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								if (healthPotion > 0) {

									playerHealth += healthPotionAmount;
									healthPotion--;

									System.out.println("\t\tYou have healed " + healthPotionAmount + " Hp");
									System.out.println("\t\tYou have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + healthPotion + " health potions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no health potions left");

								}

							}

							else if (input.equals("3")) {
								if (ultPot > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									playerHealth += ultPotAmt;
									ultPot--;

									System.out.println("\t\tYou have healed " + ultPotAmt + " Hp");
									System.out.println("\t\tYour have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + ultPot + " ultimate \n\t\tpotions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no ultimate \n\t\tpotions left");

								}

							}

							else if (input.equals("4")) {
								if (lives > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have ran from the enemy!"
											+ "\n\t\tYou restart the maze \n\t\twith full health and potions,"
											+ "\n\t\tBut you lose a life.");
									lives--;
									healthPotion = 5;
									playerHealth = maxPlayerHealth;
									fireBall = maxFireBall;
									iceShard = maxIceShard;
									cheese = maxCheese;
									continue MainGame;
								} else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou can not run \n\t\tyou are out of lives!");
								}

							}

							else if (input.equals("5")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tWhich spell would \n\t\tyou like to use?");
								System.out.println("\t\t[1] Fireball \n\t\t[2] Ice Shard \n\t\t[3] Cheese???");
								String input1 = in.nextLine();

								if (input1.equals("1")) {
									if (fireBall > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a fireball \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " is burnt \n\t\tand takes heavy damage");
										enemyHealth -= 150;
										fireBall--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Fireballs");
									}

								}

								else if (input1.equals("2")) {
									if (iceShard > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a ice shard \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " \n\t\ttakes heavy damage");
										enemyHealth -= 150;
										iceShard--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Ice Shards");
									}
								}

								else if (input1.equals("3")) {
									if (cheese > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tCHEEESSE FOR EVERYONE!!! \n\t\tAHAHAHA!!!!");
										System.out.println("\t\tThe " + enemy + " is pummeled \n\t\tby giant cheese meteors");
										enemyHealth -= 150;
										cheese--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more CHEEEESSSEEE");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tSorry wrong input");
								}

							}

							else {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tSorry Wrong Input!");

							}

						}

						if (playerHealth < 1) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("You Died2");
							break;
						}

						if (enemyHealth < 1) {
							bodyCount++;
						}
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\tYou defeated The " + enemy);
						System.out.println("\t\tYour Hp: " + playerHealth);
						System.out.println("\t\tYour body count is " + bodyCount);

						if (bodyCount == 10) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level1;
							maxHPotionAmount += level1P;
							System.out.println("\t\tYou Gain " + level1 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;

						}

						if (bodyCount == 20) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level2;
							maxHPotionAmount += level2P;
							System.out.println("\t\tYou Gain " + level2 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 30) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level3;
							maxHPotionAmount += level3P;
							System.out.println("\t\tYou Gain " + level3 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 40) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level4;
							maxHPotionAmount += level4P;
							System.out.println("\t\tYou Gain " + level4 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 50) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level5;
							maxHPotionAmount += level5P;
							System.out.println("\t\tYou Gain " + level5 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 65) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level6;
							maxHPotionAmount += level6P;
							System.out.println("\t\tYou Gain " + level6 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 80) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level7;
							maxHPotionAmount += level7P;
							System.out.println("\t\tYou Gain " + level7 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 95) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level8;
							maxHPotionAmount += level8P;
							System.out.println("\t\tYou Gain " + level8 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 110) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level9;
							maxHPotionAmount += level9P;
							System.out.println("\t\tYou Gain " + level9 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 125) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level10;
							maxHPotionAmount += level10P;
							System.out.println("\t\tYou Gain " + level10 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (healthPotion < maxHPotionAmount) {
							if (rand.nextInt(100) < healthPotionDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								healthPotion++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\ta health potion");
								System.out.println("\t\tYou now have \n\t\t" + healthPotion + " health potions");

							}
						}

						if (ultPot < maxUPotionAmount) {
							if (rand.nextInt(100) < ultPotDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								ultPot++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\tan ultimate health potion");
								System.out.println("\t\tYou now have \n\t\t" + ultPot + " ultimate health potions");

							}
						}

						if (rand.nextInt(100) < weaponDropChance) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tThe " + enemy + " has dropped a weapon.");
							int enemyWeaponDrop = rand.nextInt(100);

							while (true) {

								if (enemyWeaponDrop <= bronzeDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[bronze];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input = in.nextLine();

									if (input.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += bronzeDamage;
										break;
									}

									else if (input.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowIronDrop && enemyWeaponDrop <= highIronDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[iron];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input1 = in.nextLine();

									if (input1.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += ironDamage;
										break;
									}

									else if (input1.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowSteelDrop && enemyWeaponDrop <= highSteelDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[steel];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input2 = in.nextLine();

									if (input2.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += steelDamage;
										break;
									}

									else if (input2.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

								else if (enemyWeaponDrop >= diamondDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[diamond];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input3 = in.nextLine();

									if (input3.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += diamondDamage;
										break;
									}

									else if (input3.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

							}
						}

					}

					else if (bruh == 2) {
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\t***" + enemy + " has appeared!***");
						enemyHealth = rand.nextInt(maxTrollHealth);

						while (enemyHealth > 0) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tYour Hp: **" + playerHealth + "**");
							System.out.println("\t\t" + enemy + "'s Hp: **" + enemyHealth + "**");
							System.out.println("\t\t��What would you like to do??");
							System.out.println(
									"\t\t[1] Attack \n\t\t[2] Use Potion \n\t\t[3] Use Ultimate Potion \n\t\t[4] Run \n\t\t[5] Use Spells");

							String input = in.nextLine();

							if (input.equals("1")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

								int playerDamage = rand.nextInt(maxPlayerAttack);
								int totalPlayerDamage = playerDamage + weaponDamage;

								int enemyDamage = rand.nextInt(maxTrollAttack);

								enemyHealth -= totalPlayerDamage;
								playerHealth -= enemyDamage;

								System.out.println("\t\tYou strike " + enemy + " for " + playerDamage + " and " + weaponDamage);
								System.out.println("\t\tYou take " + enemyDamage + " from the " + enemy);

								if (playerHealth < 1) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tThe " + enemy + " has defeated you.");

									break;
								}

							}

							else if (input.equals("2")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								if (healthPotion > 0) {

									playerHealth += healthPotionAmount;
									healthPotion--;

									System.out.println("\t\tYou have healed " + healthPotionAmount + " Hp");
									System.out.println("\t\tYou have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + healthPotion + " health potions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no health potions left");

								}

							}

							else if (input.equals("3")) {
								if (ultPot > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									playerHealth += ultPotAmt;
									ultPot--;

									System.out.println("\t\tYou have healed " + ultPotAmt + " Hp");
									System.out.println("\t\tYour have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + ultPot + " ultimate \n\t\tpotions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no ultimate \n\t\tpotions left");

								}

							}

							else if (input.equals("4")) {
								if (lives > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have ran from the enemy!"
											+ "\n\t\tYou restart the maze \n\t\twith full health and potions,"
											+ "\n\t\tBut you lose a life.");
									lives--;
									healthPotion = 5;
									playerHealth = maxPlayerHealth;
									fireBall = maxFireBall;
									iceShard = maxIceShard;
									cheese = maxCheese;
									continue MainGame;
								} else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou can not run \n\t\tyou are out of lives!");
								}

							}

							else if (input.equals("5")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tWhich spell would \n\t\tyou like to use?");
								System.out.println("\t\t[1] Fireball \n\t\t[2] Ice Shard \n\t\t[3] Cheese???");
								String input1 = in.nextLine();

								if (input1.equals("1")) {
									if (fireBall > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a fireball \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " is burnt \n\t\tand takes heavy damage");
										enemyHealth -= 150;
										fireBall--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Fireballs");
									}

								}

								else if (input1.equals("2")) {
									if (iceShard > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a ice shard \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " \n\t\ttakes heavy damage");
										enemyHealth -= 150;
										iceShard--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Ice Shards");
									}
								}

								else if (input1.equals("3")) {
									if (cheese > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tCHEEESSE FOR EVERYONE!!! \n\t\tAHAHAHA!!!!");
										System.out.println("\t\tThe " + enemy + " is pummeled \n\t\tby giant cheese meteors");
										enemyHealth -= 150;
										cheese--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more CHEEEESSSEEE");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tSorry wrong input");
								}

							}

							else {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tSorry Wrong Input!");

							}

						}

						if (playerHealth < 1) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("You Died2");
							break;
						}

						if (enemyHealth < 1) {
							bodyCount++;
						}
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\tYou defeated The " + enemy);
						System.out.println("\t\tYour Hp: " + playerHealth);
						System.out.println("\t\tYour body count is " + bodyCount);

						if (bodyCount == 10) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level1;
							maxHPotionAmount += level1P;
							System.out.println("\t\tYou Gain " + level1 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;

						}

						if (bodyCount == 20) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level2;
							maxHPotionAmount += level2P;
							System.out.println("\t\tYou Gain " + level2 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 30) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level3;
							maxHPotionAmount += level3P;
							System.out.println("\t\tYou Gain " + level3 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 40) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level4;
							maxHPotionAmount += level4P;
							System.out.println("\t\tYou Gain " + level4 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 50) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level5;
							maxHPotionAmount += level5P;
							System.out.println("\t\tYou Gain " + level5 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 65) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level6;
							maxHPotionAmount += level6P;
							System.out.println("\t\tYou Gain " + level6 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 80) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level7;
							maxHPotionAmount += level7P;
							System.out.println("\t\tYou Gain " + level7 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 95) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level8;
							maxHPotionAmount += level8P;
							System.out.println("\t\tYou Gain " + level8 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 110) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level9;
							maxHPotionAmount += level9P;
							System.out.println("\t\tYou Gain " + level9 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 125) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level10;
							maxHPotionAmount += level10P;
							System.out.println("\t\tYou Gain " + level10 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (healthPotion < maxHPotionAmount) {
							if (rand.nextInt(100) < healthPotionDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								healthPotion++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\ta health potion");
								System.out.println("\t\tYou now have \n\t\t" + healthPotion + " health potions");

							}
						}

						if (ultPot < maxUPotionAmount) {
							if (rand.nextInt(100) < ultPotDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								ultPot++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\tan ultimate health potion");
								System.out.println("\t\tYou now have \n\t\t" + ultPot + " ultimate health potions");

							}
						}

						if (rand.nextInt(100) < weaponDropChance) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tThe " + enemy + " has dropped a weapon.");
							int enemyWeaponDrop = rand.nextInt(100);

							while (true) {

								if (enemyWeaponDrop <= bronzeDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[bronze];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input = in.nextLine();

									if (input.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += bronzeDamage;
										break;
									}

									else if (input.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowIronDrop && enemyWeaponDrop <= highIronDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[iron];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input1 = in.nextLine();

									if (input1.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += ironDamage;
										break;
									}

									else if (input1.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowSteelDrop && enemyWeaponDrop <= highSteelDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[steel];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input2 = in.nextLine();

									if (input2.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += steelDamage;
										break;
									}

									else if (input2.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

								else if (enemyWeaponDrop >= diamondDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[diamond];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input3 = in.nextLine();

									if (input3.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += diamondDamage;
										break;
									}

									else if (input3.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

							}
						}

					}

					else if (bruh == 3) {
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\t***" + enemy + " has appeared!***");
						enemyHealth = rand.nextInt(maxZombieHealth);

						while (enemyHealth > 0) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tYour Hp: **" + playerHealth + "**");
							System.out.println("\t\t" + enemy + "'s Hp: **" + enemyHealth + "**");
							System.out.println("\t\t��What would you like to do??");
							System.out.println(
									"\t\t[1] Attack \n\t\t[2] Use Potion \n\t\t[3] Use Ultimate Potion \n\t\t[4] Run \n\t\t[5] Use Spells");

							String input = in.nextLine();

							if (input.equals("1")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

								int playerDamage = rand.nextInt(maxPlayerAttack);
								int totalPlayerDamage = playerDamage + weaponDamage;

								int enemyDamage = rand.nextInt(maxZombieAttack);

								enemyHealth -= totalPlayerDamage;
								playerHealth -= enemyDamage;

								System.out.println("\t\tYou strike " + enemy + " for " + playerDamage + " and " + weaponDamage);
								System.out.println("\t\tYou take " + enemyDamage + " from the " + enemy);

								if (playerHealth < 1) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tThe " + enemy + " has defeated you.");

									break;
								}

							}

							else if (input.equals("2")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								if (healthPotion > 0) {

									playerHealth += healthPotionAmount;
									healthPotion--;

									System.out.println("\t\tYou have healed " + healthPotionAmount + " Hp");
									System.out.println("\t\tYou have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + healthPotion + " health potions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no health potions left");

								}

							}

							else if (input.equals("3")) {
								if (ultPot > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									playerHealth += ultPotAmt;
									ultPot--;

									System.out.println("\t\tYou have healed " + ultPotAmt + " Hp");
									System.out.println("\t\tYour have " + playerHealth + " Hp");
									System.out.println("\t\tYou have " + ultPot + " ultimate \n\t\tpotions left");

									if (playerHealth > maxPlayerHealth) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou have too much health!");
										playerHealth = maxPlayerHealth;
										System.out.println("\t\tYou now have " + playerHealth + " health");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have no ultimate \n\t\tpotions left");

								}

							}

							else if (input.equals("4")) {
								if (lives > 0) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou have ran from the enemy!"
											+ "\n\t\tYou restart the maze \n\t\twith full health and potions,"
											+ "\n\t\tBut you lose a life.");
									lives--;
									healthPotion = 5;
									playerHealth = maxPlayerHealth;
									fireBall = maxFireBall;
									iceShard = maxIceShard;
									cheese = maxCheese;
									continue MainGame;
								} else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tYou can not run \n\t\tyou are out of lives!");
								}

							}

							else if (input.equals("5")) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tWhich spell would \n\t\tyou like to use?");
								System.out.println("\t\t[1] Fireball \n\t\t[2] Ice Shard \n\t\t[3] Cheese???");
								String input1 = in.nextLine();

								if (input1.equals("1")) {
									if (fireBall > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a fireball \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " is burnt \n\t\tand takes heavy damage");
										enemyHealth -= 150;
										fireBall--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Fireballs");
									}

								}

								else if (input1.equals("2")) {
									if (iceShard > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou hurl a ice shard \n\t\tat the " + enemy);
										System.out.println("\t\tThe " + enemy + " \n\t\ttakes heavy damage");
										enemyHealth -= 150;
										iceShard--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more Ice Shards");
									}
								}

								else if (input1.equals("3")) {
									if (cheese > 0) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tCHEEESSE FOR EVERYONE!!! \n\t\tAHAHAHA!!!!");
										System.out.println("\t\tThe " + enemy + " is pummeled \n\t\tby giant cheese meteors");
										enemyHealth -= 150;
										cheese--;
									} else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Have no more CHEEEESSSEEE");
									}

								}

								else {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\t\tSorry wrong input");
								}

							}

							else {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("\t\tSorry Wrong Input!");

							}

						}

						if (playerHealth < 1) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("You Died2");
							break;
						}

						if (enemyHealth < 1) {
							bodyCount++;
						}
						System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("\t\tYou defeated The " + enemy);
						System.out.println("\t\tYour Hp: " + playerHealth);
						System.out.println("\t\tYour body count is " + bodyCount);

						if (bodyCount == 10) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level1;
							maxHPotionAmount += level1P;
							System.out.println("\t\tYou Gain " + level1 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;

						}

						if (bodyCount == 20) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level2;
							maxHPotionAmount += level2P;
							System.out.println("\t\tYou Gain " + level2 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 30) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level3;
							maxHPotionAmount += level3P;
							System.out.println("\t\tYou Gain " + level3 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 40) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level4;
							maxHPotionAmount += level4P;
							System.out.println("\t\tYou Gain " + level4 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 50) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level5;
							maxHPotionAmount += level5P;
							System.out.println("\t\tYou Gain " + level5 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 65) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level6;
							maxHPotionAmount += level6P;
							System.out.println("\t\tYou Gain " + level6 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 80) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level7;
							maxHPotionAmount += level7P;
							System.out.println("\t\tYou Gain " + level7 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 95) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level8;
							maxHPotionAmount += level8P;
							System.out.println("\t\tYou Gain " + level8 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 110) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level9;
							maxHPotionAmount += level9P;
							System.out.println("\t\tYou Gain " + level9 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (bodyCount == 125) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							levelUp++;
							System.out.println("\t\tYou Leveled Up, you are now level " + levelUp);
							maxPlayerHealth += level10;
							maxHPotionAmount += level10P;
							System.out.println("\t\tYou Gain " + level10 + " more health");
							System.out.println("\t\tYou gain full health and potions");

							playerHealth = maxPlayerHealth;
							healthPotion = maxHPotionAmount;
							ultPot++;
							maxPlayerAttack += 5;
							fireBall = maxFireBall;
							iceShard = maxIceShard;
							cheese = maxCheese;
						}

						if (healthPotion < maxHPotionAmount) {
							if (rand.nextInt(100) < healthPotionDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								healthPotion++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\ta health potion");
								System.out.println("\t\tYou now have \n\t\t" + healthPotion + " health potions");

							}
						}

						if (ultPot < maxUPotionAmount) {
							if (rand.nextInt(100) < ultPotDrop) {
								System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								ultPot++;
								System.out.println("\t\tThe " + enemy + " dropped \n\t\tan ultimate health potion");
								System.out.println("\t\tYou now have \n\t\t" + ultPot + " ultimate health potions");

							}
						}

						if (rand.nextInt(100) < weaponDropChance) {
							System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("\t\tThe " + enemy + " has dropped a weapon.");
							int enemyWeaponDrop = rand.nextInt(100);

							while (true) {

								if (enemyWeaponDrop <= bronzeDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[bronze];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input = in.nextLine();

									if (input.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += bronzeDamage;
										break;
									}

									else if (input.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowIronDrop && enemyWeaponDrop <= highIronDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[iron];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input1 = in.nextLine();

									if (input1.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += ironDamage;
										break;
									}

									else if (input1.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}
								}

								else if (enemyWeaponDrop >= lowSteelDrop && enemyWeaponDrop <= highSteelDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[steel];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input2 = in.nextLine();

									if (input2.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += steelDamage;
										break;
									}

									else if (input2.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

								else if (enemyWeaponDrop >= diamondDrop) {
									System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									weapon = weapons[diamond];
									System.out.println("\t\tIt is a " + weapon);
									System.out.println("\t\tWhat would you like to do?");
									System.out.println("\t\t[1] Take it  \n\t\t[2] Leave it");
									String input3 = in.nextLine();

									if (input3.equals("1")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou Take the " + weapon);
										weaponDamage *= 0;
										weaponDamage += diamondDamage;
										break;
									}

									else if (input3.equals("2")) {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tYou leave the weapon \n\t\tlying on the floor.");
										break;
									}

									else {
										System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("\t\tSorry wrong input.");
									}

								}

							}
						}

					}

				}

			System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t\tThanks for playing!");
				
			}
		}


