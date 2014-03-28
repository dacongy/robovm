/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("Foundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSZone/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSZonePtr extends Ptr<NSZone, NSZonePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(NSZone.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSZone() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="NSDefaultMallocZone")
    public static native NSZone getDefaultMallocZone();
    @Bridge(symbol="NSCreateZone")
    public static native NSZone create(@MachineSizedUInt long startSize, @MachineSizedUInt long granularity, boolean canFree);
    @Bridge(symbol="NSRecycleZone")
    public native void recycle();
    @Bridge(symbol="NSSetZoneName")
    public native void setName(String name);
    @Bridge(symbol="NSZoneName")
    public native String getName();
    @Bridge(symbol="NSZoneFromPointer")
    public static native NSZone fromPointer(VoidPtr ptr);
    @Bridge(symbol="NSZoneMalloc")
    public native VoidPtr malloc(@MachineSizedUInt long size);
    @Bridge(symbol="NSZoneCalloc")
    public native VoidPtr calloc(@MachineSizedUInt long numElems, @MachineSizedUInt long byteSize);
    @Bridge(symbol="NSZoneRealloc")
    public native VoidPtr realloc(VoidPtr ptr, @MachineSizedUInt long size);
    @Bridge(symbol="NSZoneFree")
    public native void free(VoidPtr ptr);
    @Bridge(symbol="NSPageSize")
    public static native @MachineSizedUInt long getPageSize();
    @Bridge(symbol="NSLogPageSize")
    public static native @MachineSizedUInt long getLogPageSize();
    @Bridge(symbol="NSRoundUpToMultipleOfPageSize")
    public static native @MachineSizedUInt long roundUpToMultipleOfPageSize(@MachineSizedUInt long bytes);
    @Bridge(symbol="NSRoundDownToMultipleOfPageSize")
    public static native @MachineSizedUInt long roundDownToMultipleOfPageSize(@MachineSizedUInt long bytes);
    @Bridge(symbol="NSAllocateMemoryPages")
    public static native VoidPtr allocateMemoryPages(@MachineSizedUInt long bytes);
    @Bridge(symbol="NSDeallocateMemoryPages")
    public static native void deallocateMemoryPages(VoidPtr ptr, @MachineSizedUInt long bytes);
    @Bridge(symbol="NSCopyMemoryPages")
    public static native void copyMemoryPages(VoidPtr source, VoidPtr dest, @MachineSizedUInt long bytes);
    @Bridge(symbol="NSRealMemoryAvailable")
    public static native @MachineSizedUInt long getRealMemoryAvailable();
    /*</methods>*/
}