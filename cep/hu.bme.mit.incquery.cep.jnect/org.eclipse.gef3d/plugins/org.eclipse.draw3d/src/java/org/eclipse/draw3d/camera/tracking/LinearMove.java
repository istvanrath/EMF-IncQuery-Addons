/*******************************************************************************
 * Copyright (c) 2011 Jens von Pilgrim and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jens von Pilgrim - initial API and implementation
 ******************************************************************************/
package org.eclipse.draw3d.camera.tracking;


/**
 * Combination of a {@link LinearMovement} and a {@link LinearRotation}.
 *
 * @author 	Jens von Pilgrim (developer@jevopi.de)
 * @version	$Revision$
 * @since 	May 22, 2011
 */
public class LinearMove extends ComposedMove {
	
	/**
	 * 
	 */
	public LinearMove() {
		addMove(new LinearMovement());
		addMove(new LinearRotation());
	}
	

}
