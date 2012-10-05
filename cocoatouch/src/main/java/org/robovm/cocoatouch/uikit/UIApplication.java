/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html">UIApplication Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIApplication /*</name>*/ 
    extends /*<extends>*/ UIResponder /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIApplication /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIApplication /*</name>*/.class);

    /*<constructors>*/
    protected UIApplication(SkipInit skipInit) { super(skipInit); }
    public UIApplication() {}
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/applicationIconBadgeNumber">@property(nonatomic) NSInteger applicationIconBadgeNumber</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("applicationIconBadgeNumber") public native int getApplicationIconBadgeNumber();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/applicationIconBadgeNumber">@property(nonatomic) NSInteger applicationIconBadgeNumber</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setApplicationIconBadgeNumber:") public native void setApplicationIconBadgeNumber(int v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/applicationState">@property(nonatomic, readonly) UIApplicationState applicationState</a>
     * @since Available in iOS 4.0 and later.
     */
    @Bind("applicationState") public native UIApplicationState getApplicationState();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/applicationSupportsShakeToEdit">@property(nonatomic) BOOL applicationSupportsShakeToEdit</a>
     * @since Available in iOS 3.0 and later.
     */
    @Bind("applicationSupportsShakeToEdit") public native boolean isApplicationSupportsShakeToEdit();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/applicationSupportsShakeToEdit">@property(nonatomic) BOOL applicationSupportsShakeToEdit</a>
     * @since Available in iOS 3.0 and later.
     */
    @Bind("setApplicationSupportsShakeToEdit:") public native void setApplicationSupportsShakeToEdit(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/backgroundTimeRemaining">@property(nonatomic, readonly) NSTimeInterval backgroundTimeRemaining</a>
     * @since Available in iOS 4.0 and later.
     */
    @Bind("backgroundTimeRemaining") public native double getBackgroundTimeRemaining();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/delegate">@property(nonatomic, assign) id&amp;lt;UIApplicationDelegate&amp;gt; delegate</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("delegate") public native UIApplicationDelegate getDelegate();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/delegate">@property(nonatomic, assign) id&amp;lt;UIApplicationDelegate&amp;gt; delegate</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setDelegate:") public native void setDelegate(UIApplicationDelegate v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/idleTimerDisabled">@property(nonatomic, getter=isIdleTimerDisabled) BOOL idleTimerDisabled</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("isIdleTimerDisabled") public native boolean isIdleTimerDisabled();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/idleTimerDisabled">@property(nonatomic, getter=isIdleTimerDisabled) BOOL idleTimerDisabled</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setIdleTimerDisabled:") public native void setIdleTimerDisabled(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/keyWindow">@property(nonatomic, readonly) UIWindow *keyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("keyWindow") public native UIWindow getKeyWindow();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/networkActivityIndicatorVisible">@property(nonatomic, getter=isNetworkActivityIndicatorVisible) BOOL networkActivityIndicatorVisible</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("isNetworkActivityIndicatorVisible") public native boolean isNetworkActivityIndicatorVisible();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/networkActivityIndicatorVisible">@property(nonatomic, getter=isNetworkActivityIndicatorVisible) BOOL networkActivityIndicatorVisible</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setNetworkActivityIndicatorVisible:") public native void setNetworkActivityIndicatorVisible(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/protectedDataAvailable">@property(nonatomic, readonly, getter=isProtectedDataAvailable) BOOL protectedDataAvailable</a>
     * @since Available in iOS 4.0 and later.
     */
    @Bind("isProtectedDataAvailable") public native boolean isProtectedDataAvailable();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/scheduledLocalNotifications">@property(nonatomic, copy) NSArray *scheduledLocalNotifications</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("scheduledLocalNotifications") public native NSArray getScheduledLocalNotifications();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/scheduledLocalNotifications">@property(nonatomic, copy) NSArray *scheduledLocalNotifications</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("setScheduledLocalNotifications:") public native void setScheduledLocalNotifications(NSArray v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarFrame">@property(nonatomic, readonly) CGRect statusBarFrame</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("statusBarFrame") public native CGRect getStatusBarFrame();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarHidden">@property(nonatomic, getter=isStatusBarHidden) BOOL statusBarHidden</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("isStatusBarHidden") public native boolean isStatusBarHidden();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarHidden">@property(nonatomic, getter=isStatusBarHidden) BOOL statusBarHidden</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setStatusBarHidden:") public native void setStatusBarHidden(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarOrientation">@property(nonatomic) UIInterfaceOrientation statusBarOrientation</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("statusBarOrientation") public native UIInterfaceOrientation getStatusBarOrientation();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarOrientation">@property(nonatomic) UIInterfaceOrientation statusBarOrientation</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setStatusBarOrientation:") public native void setStatusBarOrientation(UIInterfaceOrientation v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarOrientationAnimationDuration">@property(nonatomic, readonly) NSTimeInterval statusBarOrientationAnimationDuration</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("statusBarOrientationAnimationDuration") public native double getStatusBarOrientationAnimationDuration();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarStyle">@property(nonatomic) UIStatusBarStyle statusBarStyle</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("statusBarStyle") public native UIStatusBarStyle getStatusBarStyle();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/statusBarStyle">@property(nonatomic) UIStatusBarStyle statusBarStyle</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setStatusBarStyle:") public native void setStatusBarStyle(UIStatusBarStyle v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/userInterfaceLayoutDirection">@property(nonatomic, readonly) UIUserInterfaceLayoutDirection userInterfaceLayoutDirection</a>
     * @since Available in iOS 5.0 and later.
     */
    @Bind("userInterfaceLayoutDirection") public native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instp/UIApplication/windows">@property(nonatomic, readonly) NSArray *windows</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("windows") public native NSArray getWindows();
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector sharedApplication = Selector.register("sharedApplication");
    @Bridge(symbol = "objc_msgSend") private native static UIApplication objc_getSharedApplication(ObjCClass __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/clm/UIApplication/sharedApplication">+ (UIApplication *)sharedApplication</a>
     * @since Available in iOS 2.0 and later.
     */
    public static UIApplication getSharedApplication() {
        return objc_getSharedApplication(objCClass, sharedApplication);
    }
    
    private static final Selector beginBackgroundTaskWithExpirationHandler$ = Selector.register("beginBackgroundTaskWithExpirationHandler:");
    @Bridge(symbol = "objc_msgSend") private native static int objc_beginBackgroundTask(UIApplication __self__, Selector __cmd__, VoidBlock handler);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_beginBackgroundTaskSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, VoidBlock handler);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/beginBackgroundTaskWithExpirationHandler:">- (UIBackgroundTaskIdentifier)beginBackgroundTaskWithExpirationHandler:(void (^)(void))handler</a>
     * @since Available in iOS 4.0 and later.
     */
    public int beginBackgroundTask(VoidBlock handler) {
        if (customClass) { return objc_beginBackgroundTaskSuper(getSuper(), this, beginBackgroundTaskWithExpirationHandler$, handler); } else { return objc_beginBackgroundTask(this, beginBackgroundTaskWithExpirationHandler$, handler); }
    }
    
    private static final Selector beginIgnoringInteractionEvents = Selector.register("beginIgnoringInteractionEvents");
    @Bridge(symbol = "objc_msgSend") private native static void objc_beginIgnoringInteractionEvents(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_beginIgnoringInteractionEventsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/beginIgnoringInteractionEvents">- (void)beginIgnoringInteractionEvents</a>
     * @since Available in iOS 2.0 and later.
     */
    public void beginIgnoringInteractionEvents() {
        if (customClass) { objc_beginIgnoringInteractionEventsSuper(getSuper(), this, beginIgnoringInteractionEvents); } else { objc_beginIgnoringInteractionEvents(this, beginIgnoringInteractionEvents); }
    }
    
    private static final Selector beginReceivingRemoteControlEvents = Selector.register("beginReceivingRemoteControlEvents");
    @Bridge(symbol = "objc_msgSend") private native static void objc_beginReceivingRemoteControlEvents(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_beginReceivingRemoteControlEventsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/beginReceivingRemoteControlEvents">- (void)beginReceivingRemoteControlEvents</a>
     * @since Available in iOS 4.0 and later.
     */
    public void beginReceivingRemoteControlEvents() {
        if (customClass) { objc_beginReceivingRemoteControlEventsSuper(getSuper(), this, beginReceivingRemoteControlEvents); } else { objc_beginReceivingRemoteControlEvents(this, beginReceivingRemoteControlEvents); }
    }
    
    private static final Selector canOpenURL$ = Selector.register("canOpenURL:");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_canOpenURL(UIApplication __self__, Selector __cmd__, NSURL url);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_canOpenURLSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, NSURL url);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/canOpenURL:">- (BOOL)canOpenURL:(NSURL *)url</a>
     * @since Available in iOS 3.0 and later.
     */
    public boolean canOpenURL(NSURL url) {
        if (customClass) { return objc_canOpenURLSuper(getSuper(), this, canOpenURL$, url); } else { return objc_canOpenURL(this, canOpenURL$, url); }
    }
    
    private static final Selector cancelAllLocalNotifications = Selector.register("cancelAllLocalNotifications");
    @Bridge(symbol = "objc_msgSend") private native static void objc_cancelAllLocalNotifications(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_cancelAllLocalNotificationsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/cancelAllLocalNotifications">- (void)cancelAllLocalNotifications</a>
     * @since Available in iOS 4.0 and later.
     */
    public void cancelAllLocalNotifications() {
        if (customClass) { objc_cancelAllLocalNotificationsSuper(getSuper(), this, cancelAllLocalNotifications); } else { objc_cancelAllLocalNotifications(this, cancelAllLocalNotifications); }
    }
    
    private static final Selector cancelLocalNotification$ = Selector.register("cancelLocalNotification:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_cancelLocalNotification(UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_cancelLocalNotificationSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/cancelLocalNotification:">- (void)cancelLocalNotification:(UILocalNotification *)notification</a>
     * @since Available in iOS 4.0 and later.
     */
    public void cancelLocalNotification(UILocalNotification notification) {
        if (customClass) { objc_cancelLocalNotificationSuper(getSuper(), this, cancelLocalNotification$, notification); } else { objc_cancelLocalNotification(this, cancelLocalNotification$, notification); }
    }
    
    private static final Selector clearKeepAliveTimeout = Selector.register("clearKeepAliveTimeout");
    @Bridge(symbol = "objc_msgSend") private native static void objc_clearKeepAliveTimeout(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_clearKeepAliveTimeoutSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/clearKeepAliveTimeout">- (void)clearKeepAliveTimeout</a>
     * @since Available in iOS 4.0 and later.
     */
    public void clearKeepAliveTimeout() {
        if (customClass) { objc_clearKeepAliveTimeoutSuper(getSuper(), this, clearKeepAliveTimeout); } else { objc_clearKeepAliveTimeout(this, clearKeepAliveTimeout); }
    }
    
    private static final Selector completeStateRestoration = Selector.register("completeStateRestoration");
    @Bridge(symbol = "objc_msgSend") private native static void objc_completeStateRestoration(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_completeStateRestorationSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/completeStateRestoration">- (void)completeStateRestoration</a>
     * @since Available in iOS 6.0 and later.
     */
    public void completeStateRestoration() {
        if (customClass) { objc_completeStateRestorationSuper(getSuper(), this, completeStateRestoration); } else { objc_completeStateRestoration(this, completeStateRestoration); }
    }
    
    private static final Selector endBackgroundTask$ = Selector.register("endBackgroundTask:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_endBackgroundTask(UIApplication __self__, Selector __cmd__, int identifier);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_endBackgroundTaskSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, int identifier);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/endBackgroundTask:">- (void)endBackgroundTask:(UIBackgroundTaskIdentifier)identifier</a>
     * @since Available in iOS 4.0 and later.
     */
    public void endBackgroundTask(int identifier) {
        if (customClass) { objc_endBackgroundTaskSuper(getSuper(), this, endBackgroundTask$, identifier); } else { objc_endBackgroundTask(this, endBackgroundTask$, identifier); }
    }
    
    private static final Selector endIgnoringInteractionEvents = Selector.register("endIgnoringInteractionEvents");
    @Bridge(symbol = "objc_msgSend") private native static void objc_endIgnoringInteractionEvents(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_endIgnoringInteractionEventsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/endIgnoringInteractionEvents">- (void)endIgnoringInteractionEvents</a>
     * @since Available in iOS 2.0 and later.
     */
    public void endIgnoringInteractionEvents() {
        if (customClass) { objc_endIgnoringInteractionEventsSuper(getSuper(), this, endIgnoringInteractionEvents); } else { objc_endIgnoringInteractionEvents(this, endIgnoringInteractionEvents); }
    }
    
    private static final Selector endReceivingRemoteControlEvents = Selector.register("endReceivingRemoteControlEvents");
    @Bridge(symbol = "objc_msgSend") private native static void objc_endReceivingRemoteControlEvents(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_endReceivingRemoteControlEventsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/endReceivingRemoteControlEvents">- (void)endReceivingRemoteControlEvents</a>
     * @since Available in iOS 4.0 and later.
     */
    public void endReceivingRemoteControlEvents() {
        if (customClass) { objc_endReceivingRemoteControlEventsSuper(getSuper(), this, endReceivingRemoteControlEvents); } else { objc_endReceivingRemoteControlEvents(this, endReceivingRemoteControlEvents); }
    }
    
    private static final Selector extendStateRestoration = Selector.register("extendStateRestoration");
    @Bridge(symbol = "objc_msgSend") private native static void objc_extendStateRestoration(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_extendStateRestorationSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/extendStateRestoration">- (void)extendStateRestoration</a>
     * @since Available in iOS 6.0 and later.
     */
    public void extendStateRestoration() {
        if (customClass) { objc_extendStateRestorationSuper(getSuper(), this, extendStateRestoration); } else { objc_extendStateRestoration(this, extendStateRestoration); }
    }
    
    private static final Selector enabledRemoteNotificationTypes = Selector.register("enabledRemoteNotificationTypes");
    @Bridge(symbol = "objc_msgSend") private native static EnumSet<UIRemoteNotificationType> objc_getEnabledRemoteNotificationTypes(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static EnumSet<UIRemoteNotificationType> objc_getEnabledRemoteNotificationTypesSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/enabledRemoteNotificationTypes">- (UIRemoteNotificationType)enabledRemoteNotificationTypes</a>
     * @since Available in iOS 3.0 and later.
     */
    public EnumSet<UIRemoteNotificationType> getEnabledRemoteNotificationTypes() {
        if (customClass) { return objc_getEnabledRemoteNotificationTypesSuper(getSuper(), this, enabledRemoteNotificationTypes); } else { return objc_getEnabledRemoteNotificationTypes(this, enabledRemoteNotificationTypes); }
    }
    
    private static final Selector supportedInterfaceOrientationsForWindow$ = Selector.register("supportedInterfaceOrientationsForWindow:");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getSupportedInterfaceOrientations(UIApplication __self__, Selector __cmd__, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getSupportedInterfaceOrientationsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/supportedInterfaceOrientationsForWindow:">- (NSUInteger)supportedInterfaceOrientationsForWindow:(UIWindow *)window</a>
     * @since Available in iOS 6.0 and later.
     */
    public int getSupportedInterfaceOrientations(UIWindow window) {
        if (customClass) { return objc_getSupportedInterfaceOrientationsSuper(getSuper(), this, supportedInterfaceOrientationsForWindow$, window); } else { return objc_getSupportedInterfaceOrientations(this, supportedInterfaceOrientationsForWindow$, window); }
    }
    
    private static final Selector isIgnoringInteractionEvents = Selector.register("isIgnoringInteractionEvents");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isIgnoringInteractionEvents(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isIgnoringInteractionEventsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/isIgnoringInteractionEvents">- (BOOL)isIgnoringInteractionEvents</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isIgnoringInteractionEvents() {
        if (customClass) { return objc_isIgnoringInteractionEventsSuper(getSuper(), this, isIgnoringInteractionEvents); } else { return objc_isIgnoringInteractionEvents(this, isIgnoringInteractionEvents); }
    }
    
    private static final Selector openURL$ = Selector.register("openURL:");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_openURL(UIApplication __self__, Selector __cmd__, NSURL url);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_openURLSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, NSURL url);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/openURL:">- (BOOL)openURL:(NSURL *)url</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean openURL(NSURL url) {
        if (customClass) { return objc_openURLSuper(getSuper(), this, openURL$, url); } else { return objc_openURL(this, openURL$, url); }
    }
    
    private static final Selector presentLocalNotificationNow$ = Selector.register("presentLocalNotificationNow:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_presentLocalNotificationNow(UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_presentLocalNotificationNowSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/presentLocalNotificationNow:">- (void)presentLocalNotificationNow:(UILocalNotification *)notification</a>
     * @since Available in iOS 4.0 and later.
     */
    public void presentLocalNotificationNow(UILocalNotification notification) {
        if (customClass) { objc_presentLocalNotificationNowSuper(getSuper(), this, presentLocalNotificationNow$, notification); } else { objc_presentLocalNotificationNow(this, presentLocalNotificationNow$, notification); }
    }
    
    private static final Selector registerForRemoteNotificationTypes$ = Selector.register("registerForRemoteNotificationTypes:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_registerForRemoteNotificationTypes(UIApplication __self__, Selector __cmd__, EnumSet<UIRemoteNotificationType> types);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_registerForRemoteNotificationTypesSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, EnumSet<UIRemoteNotificationType> types);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/registerForRemoteNotificationTypes:">- (void)registerForRemoteNotificationTypes:(UIRemoteNotificationType)types</a>
     * @since Available in iOS 3.0 and later.
     */
    public void registerForRemoteNotificationTypes(EnumSet<UIRemoteNotificationType> types) {
        if (customClass) { objc_registerForRemoteNotificationTypesSuper(getSuper(), this, registerForRemoteNotificationTypes$, types); } else { objc_registerForRemoteNotificationTypes(this, registerForRemoteNotificationTypes$, types); }
    }
    
    private static final Selector scheduleLocalNotification$ = Selector.register("scheduleLocalNotification:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_scheduleLocalNotification(UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_scheduleLocalNotificationSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UILocalNotification notification);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/scheduleLocalNotification:">- (void)scheduleLocalNotification:(UILocalNotification *)notification</a>
     * @since Available in iOS 4.0 and later.
     */
    public void scheduleLocalNotification(UILocalNotification notification) {
        if (customClass) { objc_scheduleLocalNotificationSuper(getSuper(), this, scheduleLocalNotification$, notification); } else { objc_scheduleLocalNotification(this, scheduleLocalNotification$, notification); }
    }
    
    private static final Selector sendAction$to$from$forEvent$ = Selector.register("sendAction:to:from:forEvent:");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_sendAction(UIApplication __self__, Selector __cmd__, Selector action, NSObject target, NSObject sender, UIEvent event);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_sendActionSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, Selector action, NSObject target, NSObject sender, UIEvent event);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/sendAction:to:from:forEvent:">- (BOOL)sendAction:(SEL)action to:(id)target from:(id)sender forEvent:(UIEvent *)event</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean sendAction(Selector action, NSObject target, NSObject sender, UIEvent event) {
        if (customClass) { return objc_sendActionSuper(getSuper(), this, sendAction$to$from$forEvent$, action, target, sender, event); } else { return objc_sendAction(this, sendAction$to$from$forEvent$, action, target, sender, event); }
    }
    
    private static final Selector sendEvent$ = Selector.register("sendEvent:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_sendEvent(UIApplication __self__, Selector __cmd__, UIEvent event);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_sendEventSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UIEvent event);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/sendEvent:">- (void)sendEvent:(UIEvent *)event</a>
     * @since Available in iOS 2.0 and later.
     */
    public void sendEvent(UIEvent event) {
        if (customClass) { objc_sendEventSuper(getSuper(), this, sendEvent$, event); } else { objc_sendEvent(this, sendEvent$, event); }
    }
    
    private static final Selector setKeepAliveTimeout$handler$ = Selector.register("setKeepAliveTimeout:handler:");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_setKeepAliveTimeout(UIApplication __self__, Selector __cmd__, double timeout, VoidBlock keepAliveHandler);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_setKeepAliveTimeoutSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, double timeout, VoidBlock keepAliveHandler);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/setKeepAliveTimeout:handler:">- (BOOL)setKeepAliveTimeout:(NSTimeInterval)timeout handler:(void (^)(void))keepAliveHandler</a>
     * @since Available in iOS 4.0 and later.
     */
    public boolean setKeepAliveTimeout(double timeout, VoidBlock keepAliveHandler) {
        if (customClass) { return objc_setKeepAliveTimeoutSuper(getSuper(), this, setKeepAliveTimeout$handler$, timeout, keepAliveHandler); } else { return objc_setKeepAliveTimeout(this, setKeepAliveTimeout$handler$, timeout, keepAliveHandler); }
    }
    
    private static final Selector setNewsstandIconImage$ = Selector.register("setNewsstandIconImage:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setNewsstandIconImage(UIApplication __self__, Selector __cmd__, UIImage image);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setNewsstandIconImageSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UIImage image);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/setNewsstandIconImage:">- (void)setNewsstandIconImage:(UIImage *)image</a>
     * @since Available in iOS 5.0 and later.
     */
    public void setNewsstandIconImage(UIImage image) {
        if (customClass) { objc_setNewsstandIconImageSuper(getSuper(), this, setNewsstandIconImage$, image); } else { objc_setNewsstandIconImage(this, setNewsstandIconImage$, image); }
    }
    
    private static final Selector setStatusBarHidden$withAnimation$ = Selector.register("setStatusBarHidden:withAnimation:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setStatusBarHidden(UIApplication __self__, Selector __cmd__, boolean hidden, UIStatusBarAnimation animation);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setStatusBarHiddenSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, boolean hidden, UIStatusBarAnimation animation);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/setStatusBarHidden:withAnimation:">- (void)setStatusBarHidden:(BOOL)hidden withAnimation:(UIStatusBarAnimation)animation</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setStatusBarHidden(boolean hidden, UIStatusBarAnimation animation) {
        if (customClass) { objc_setStatusBarHiddenSuper(getSuper(), this, setStatusBarHidden$withAnimation$, hidden, animation); } else { objc_setStatusBarHidden(this, setStatusBarHidden$withAnimation$, hidden, animation); }
    }
    
    private static final Selector setStatusBarOrientation$animated$ = Selector.register("setStatusBarOrientation:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setStatusBarOrientation(UIApplication __self__, Selector __cmd__, UIInterfaceOrientation interfaceOrientation, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setStatusBarOrientationSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UIInterfaceOrientation interfaceOrientation, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/setStatusBarOrientation:animated:">- (void)setStatusBarOrientation:(UIInterfaceOrientation)interfaceOrientation animated:(BOOL)animated</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setStatusBarOrientation(UIInterfaceOrientation interfaceOrientation, boolean animated) {
        if (customClass) { objc_setStatusBarOrientationSuper(getSuper(), this, setStatusBarOrientation$animated$, interfaceOrientation, animated); } else { objc_setStatusBarOrientation(this, setStatusBarOrientation$animated$, interfaceOrientation, animated); }
    }
    
    private static final Selector setStatusBarStyle$animated$ = Selector.register("setStatusBarStyle:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setStatusBarStyle(UIApplication __self__, Selector __cmd__, UIStatusBarStyle statusBarStyle, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setStatusBarStyleSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__, UIStatusBarStyle statusBarStyle, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/setStatusBarStyle:animated:">- (void)setStatusBarStyle:(UIStatusBarStyle)statusBarStyle animated:(BOOL)animated</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setStatusBarStyle(UIStatusBarStyle statusBarStyle, boolean animated) {
        if (customClass) { objc_setStatusBarStyleSuper(getSuper(), this, setStatusBarStyle$animated$, statusBarStyle, animated); } else { objc_setStatusBarStyle(this, setStatusBarStyle$animated$, statusBarStyle, animated); }
    }
    
    private static final Selector unregisterForRemoteNotifications = Selector.register("unregisterForRemoteNotifications");
    @Bridge(symbol = "objc_msgSend") private native static void objc_unregisterForRemoteNotifications(UIApplication __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_unregisterForRemoteNotificationsSuper(ObjCSuper __super__, UIApplication __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIApplication_Class/Reference/Reference.html#//apple_ref/occ/instm/UIApplication/unregisterForRemoteNotifications">- (void)unregisterForRemoteNotifications</a>
     * @since Available in iOS 3.0 and later.
     */
    public void unregisterForRemoteNotifications() {
        if (customClass) { objc_unregisterForRemoteNotificationsSuper(getSuper(), this, unregisterForRemoteNotifications); } else { objc_unregisterForRemoteNotifications(this, unregisterForRemoteNotifications); }
    }
    /*</methods>*/

}