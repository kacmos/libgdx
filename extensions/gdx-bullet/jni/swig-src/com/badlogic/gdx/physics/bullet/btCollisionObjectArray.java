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

public class btCollisionObjectArray extends BulletBase {
	private long swigCPtr;
	
	protected btCollisionObjectArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCollisionObjectArray(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObjectArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObjectArray obj) {
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
				gdxBulletJNI.delete_btCollisionObjectArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btCollisionObjectArray() {
    this(gdxBulletJNI.new_btCollisionObjectArray__SWIG_0(), true);
  }

  public btCollisionObjectArray(btCollisionObjectArray otherArray) {
    this(gdxBulletJNI.new_btCollisionObjectArray__SWIG_1(btCollisionObjectArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return gdxBulletJNI.btCollisionObjectArray_size(swigCPtr, this);
  }

  public btCollisionObject at(int n) {
	return btCollisionObject.getInstance(gdxBulletJNI.btCollisionObjectArray_at__SWIG_0(swigCPtr, this, n), false);
}

  public void clear() {
    gdxBulletJNI.btCollisionObjectArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    gdxBulletJNI.btCollisionObjectArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    gdxBulletJNI.btCollisionObjectArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, btCollisionObject fillData) {
    gdxBulletJNI.btCollisionObjectArray_resize__SWIG_0(swigCPtr, this, newsize, btCollisionObject.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    gdxBulletJNI.btCollisionObjectArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public SWIGTYPE_p_p_btCollisionObject expandNonInitializing() {
    return new SWIGTYPE_p_p_btCollisionObject(gdxBulletJNI.btCollisionObjectArray_expandNonInitializing(swigCPtr, this), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand(btCollisionObject fillValue) {
    return new SWIGTYPE_p_p_btCollisionObject(gdxBulletJNI.btCollisionObjectArray_expand__SWIG_0(swigCPtr, this, btCollisionObject.getCPtr(fillValue), fillValue), false);
  }

  public SWIGTYPE_p_p_btCollisionObject expand() {
    return new SWIGTYPE_p_p_btCollisionObject(gdxBulletJNI.btCollisionObjectArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(btCollisionObject _Val) {
    gdxBulletJNI.btCollisionObjectArray_push_back(swigCPtr, this, btCollisionObject.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return gdxBulletJNI.btCollisionObjectArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    gdxBulletJNI.btCollisionObjectArray_reserve(swigCPtr, this, _Count);
  }

  public void swap(int index0, int index1) {
    gdxBulletJNI.btCollisionObjectArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(btCollisionObject key) {
    return gdxBulletJNI.btCollisionObjectArray_findBinarySearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public int findLinearSearch(btCollisionObject key) {
    return gdxBulletJNI.btCollisionObjectArray_findLinearSearch(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void remove(btCollisionObject key) {
    gdxBulletJNI.btCollisionObjectArray_remove(swigCPtr, this, btCollisionObject.getCPtr(key), key);
  }

  public void initializeFromBuffer(SWIGTYPE_p_void buffer, int size, int capacity) {
    gdxBulletJNI.btCollisionObjectArray_initializeFromBuffer(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buffer), size, capacity);
  }

  public void copyFromArray(btCollisionObjectArray otherArray) {
    gdxBulletJNI.btCollisionObjectArray_copyFromArray(swigCPtr, this, btCollisionObjectArray.getCPtr(otherArray), otherArray);
  }

}
