/*******************************************************************************
 * Copyright (c) 2012 jnect.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eugen Neufeld - initial API and implementation
 *******************************************************************************/
package org.jnect.demo.gef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.jnect.bodymodel.Body;
import org.jnect.core.IKinectUpdateListener;
import org.jnect.core.KinectManager;

public class HumanDiagramGraphicalEditor extends GraphicalEditor implements IKinectUpdateListener {

	public HumanDiagramGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
		KinectManager.INSTANCE.addKinectUpdateListener(this);
	}

	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new HumanDiagramEditPartFactory());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		//
	}


	@Override
	protected void initializeGraphicalViewer() {
		getGraphicalViewer().setContents( KinectManager.INSTANCE.getSkeletonModel() );
	}


	@Override
	public void kinectChangedModel() {
		// big refresh necessary
		initializeGraphicalViewer();
	}
	
	@Override
	public void dispose() {
		KinectManager.INSTANCE.removeKinectUpdateListener(this);
		super.dispose();
	}

}
