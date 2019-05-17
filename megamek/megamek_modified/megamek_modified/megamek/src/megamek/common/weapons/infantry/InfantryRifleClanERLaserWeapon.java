/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantryRifleClanERLaserWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryRifleClanERLaserWeapon() {
		super();

		name = "Laser Rifle (ER)";
		setInternalName(name);
		addLookupName("InfantryClanERLaserRifle");
		addLookupName("Infantry Clan ER Laser Rifle");
		ammoType = AmmoType.T_NA;
		cost = 2000;
		bv = 2.01;
		tonnage = .005;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_LASER).or(F_ENERGY);
		infantryDamage = 0.28;
		infantryRange = 3;
		rulesRefs = "273,TM";
		techAdvancement.setTechBase(TECH_BASE_CLAN).setClanAdvancement(2840, 2845, DATE_NONE, DATE_NONE, DATE_NONE)
		        .setClanApproximate(true, false, false, false, false).setPrototypeFactions(F_CSA)
		        .setProductionFactions(F_CSA).setTechRating(RATING_F)
		        .setAvailability(RATING_X, RATING_D, RATING_D, RATING_C);

	}
}