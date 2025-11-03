## AD_13_Broadcast_App

### 📱 Short Description

Application demonstrating the use of an **Android Broadcast Receiver** to listen for and respond to system-wide broadcast events, specifically **Airplane Mode toggling**.

---

### 🧩 Concepts Covered

* **Broadcast Receiver** (component that listens for system broadcasts/Intents)
* `onReceive()` method (the callback executed when a broadcast is detected)
* **Intent Filter** (specifies the broadcast action to listen for, e.g., `ACTION_AIRPLANE_MODE_CHANGE`)
* **Dynamic Registration** (registering the receiver in the Activity's code at runtime, required for modern Android APIs)

---

### 🎯 Learning / Discovery Points

* Creating a class that **extends `BroadcastReceiver`**.
* Implementing the `onReceive` method and checking the received `Intent`'s action.
* Accessing data within the broadcast using `get action()` and `getBooleanExtra()` methods.
* Understanding the difference between static registration (in Manifest, deprecated for implicit broadcasts in modern APIs) and dynamic registration using `registerReceiver()`.

---

### ⚙️ App Features / Usage

* Listens in the background for system changes related to network connectivity.
* When Airplane Mode is toggled (on or off), a **Toast message** is displayed to the user confirming the status.

---

### 📝 Note

Broadcast Receivers are essential for reacting to device state changes (like battery level, connectivity, calls) without running a full application interface.

---

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_13_Broadcast_App/blob/main/Result%20Pics/01%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Result
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_13_Broadcast_App/blob/main/Result%20Pics/02%20Result.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Result
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_13_Broadcast_App/blob/main/Result%20Pics/03%20Result.jpg" height="510" width="240"> </td> </tr> </table>

---
