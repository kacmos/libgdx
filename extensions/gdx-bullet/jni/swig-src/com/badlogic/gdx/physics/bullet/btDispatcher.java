/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDispatcher extends BulletBase {
	private long swigCPtr;
	
	protected btDispatcher(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btDispatcher(long cPtr, boolean cMemoryOwn) {
		this("btDispatcher", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDispatcher obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btDispatcher(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btCollisionAlgorithm findAlgorithm(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btPersistentManifold sharedManifold) {
    long cPtr = gdxBulletJNI.btDispatcher_findAlgorithm__SWIG_0(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btPersistentManifold.getCPtr(sharedManifold), sharedManifold);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public btCollisionAlgorithm findAlgorithm(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    long cPtr = gdxBulletJNI.btDispatcher_findAlgorithm__SWIG_1(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public btPersistentManifold getNewManifold(btCollisionObject b0, btCollisionObject b1) {
    long cPtr = gdxBulletJNI.btDispatcher_getNewManifold(swigCPtr, this, btCollisionObject.getCPtr(b0), b0, btCollisionObject.getCPtr(b1), b1);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public void releaseManifold(btPersistentManifold manifold) {
    gdxBulletJNI.btDispatcher_releaseManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public void clearManifold(btPersistentManifold manifold) {
    gdxBulletJNI.btDispatcher_clearManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifold), manifold);
  }

  public boolean needsCollision(btCollisionObject body0, btCollisionObject body1) {
    return gdxBulletJNI.btDispatcher_needsCollision(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public boolean needsResponse(btCollisionObject body0, btCollisionObject body1) {
    return gdxBulletJNI.btDispatcher_needsResponse(swigCPtr, this, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1);
  }

  public void dispatchAllCollisionPairs(btOverlappingPairCache pairCache, btDispatcherInfo dispatchInfo, btDispatcher dispatcher) {
    gdxBulletJNI.btDispatcher_dispatchAllCollisionPairs(swigCPtr, this, btOverlappingPairCache.getCPtr(pairCache), pairCache, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public int getNumManifolds() {
    return gdxBulletJNI.btDispatcher_getNumManifolds(swigCPtr, this);
  }

  public btPersistentManifold getManifoldByIndexInternal(int index) {
    long cPtr = gdxBulletJNI.btDispatcher_getManifoldByIndexInternal(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public SWIGTYPE_p_p_btPersistentManifold getInternalManifoldPointer() {
    long cPtr = gdxBulletJNI.btDispatcher_getInternalManifoldPointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btPersistentManifold(cPtr, false);
  }

  public btPoolAllocator getInternalManifoldPool() {
    long cPtr = gdxBulletJNI.btDispatcher_getInternalManifoldPool__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public SWIGTYPE_p_void allocateCollisionAlgorithm(int size) {
    long cPtr = gdxBulletJNI.btDispatcher_allocateCollisionAlgorithm(swigCPtr, this, size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void freeCollisionAlgorithm(SWIGTYPE_p_void ptr) {
    gdxBulletJNI.btDispatcher_freeCollisionAlgorithm(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr));
  }

}
