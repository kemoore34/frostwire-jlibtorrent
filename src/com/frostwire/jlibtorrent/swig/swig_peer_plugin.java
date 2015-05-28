/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_peer_plugin {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected swig_peer_plugin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_peer_plugin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_peer_plugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_peer_plugin_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_peer_plugin_change_ownership(this, swigCPtr, true);
  }

  public String type() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_type(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_typeSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public void add_handshake(entry e) {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_add_handshake(swigCPtr, this, entry.getCPtr(e), e); else libtorrent_jni.swig_peer_plugin_add_handshakeSwigExplicitswig_peer_plugin(swigCPtr, this, entry.getCPtr(e), e);
  }

  public void on_disconnect(error_code ec) {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_on_disconnect(swigCPtr, this, error_code.getCPtr(ec), ec); else libtorrent_jni.swig_peer_plugin_on_disconnectSwigExplicitswig_peer_plugin(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public void on_connected() {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_on_connected(swigCPtr, this); else libtorrent_jni.swig_peer_plugin_on_connectedSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_handshake(String reserved_bits) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_handshake(swigCPtr, this, reserved_bits) : libtorrent_jni.swig_peer_plugin_on_handshakeSwigExplicitswig_peer_plugin(swigCPtr, this, reserved_bits);
  }

  public boolean on_extension_handshake(bdecode_node n) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_extension_handshake(swigCPtr, this, bdecode_node.getCPtr(n), n) : libtorrent_jni.swig_peer_plugin_on_extension_handshakeSwigExplicitswig_peer_plugin(swigCPtr, this, bdecode_node.getCPtr(n), n);
  }

  public boolean on_choke() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_choke(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_chokeSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_unchoke() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_unchoke(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_unchokeSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_interested() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_interested(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_interestedSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_not_interested() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_not_interested(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_not_interestedSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_have(int index) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_have(swigCPtr, this, index) : libtorrent_jni.swig_peer_plugin_on_haveSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public boolean on_dont_have(int index) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_dont_have(swigCPtr, this, index) : libtorrent_jni.swig_peer_plugin_on_dont_haveSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public boolean on_bitfield(bitfield bitfield) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_bitfield(swigCPtr, this, bitfield.getCPtr(bitfield), bitfield) : libtorrent_jni.swig_peer_plugin_on_bitfieldSwigExplicitswig_peer_plugin(swigCPtr, this, bitfield.getCPtr(bitfield), bitfield);
  }

  public boolean on_have_all() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_have_all(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_have_allSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_have_none() {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_have_none(swigCPtr, this) : libtorrent_jni.swig_peer_plugin_on_have_noneSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean on_allowed_fast(int index) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_allowed_fast(swigCPtr, this, index) : libtorrent_jni.swig_peer_plugin_on_allowed_fastSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public boolean on_request(peer_request r) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_request(swigCPtr, this, peer_request.getCPtr(r), r) : libtorrent_jni.swig_peer_plugin_on_requestSwigExplicitswig_peer_plugin(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public boolean on_piece(peer_request piece, disk_buffer_holder data) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_piece(swigCPtr, this, peer_request.getCPtr(piece), piece, disk_buffer_holder.getCPtr(data), data) : libtorrent_jni.swig_peer_plugin_on_pieceSwigExplicitswig_peer_plugin(swigCPtr, this, peer_request.getCPtr(piece), piece, disk_buffer_holder.getCPtr(data), data);
  }

  public boolean on_cancel(peer_request r) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_cancel(swigCPtr, this, peer_request.getCPtr(r), r) : libtorrent_jni.swig_peer_plugin_on_cancelSwigExplicitswig_peer_plugin(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public boolean on_reject(peer_request r) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_reject(swigCPtr, this, peer_request.getCPtr(r), r) : libtorrent_jni.swig_peer_plugin_on_rejectSwigExplicitswig_peer_plugin(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public boolean on_suggest(int index) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_on_suggest(swigCPtr, this, index) : libtorrent_jni.swig_peer_plugin_on_suggestSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public void sent_unchoke() {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_sent_unchoke(swigCPtr, this); else libtorrent_jni.swig_peer_plugin_sent_unchokeSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public void sent_payload(int bytes) {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_sent_payload(swigCPtr, this, bytes); else libtorrent_jni.swig_peer_plugin_sent_payloadSwigExplicitswig_peer_plugin(swigCPtr, this, bytes);
  }

  public boolean can_disconnect(error_code ec) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_can_disconnect(swigCPtr, this, error_code.getCPtr(ec), ec) : libtorrent_jni.swig_peer_plugin_can_disconnectSwigExplicitswig_peer_plugin(swigCPtr, this, error_code.getCPtr(ec), ec);
  }

  public void on_piece_pass(int index) {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_on_piece_pass(swigCPtr, this, index); else libtorrent_jni.swig_peer_plugin_on_piece_passSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public void on_piece_failed(int index) {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_on_piece_failed(swigCPtr, this, index); else libtorrent_jni.swig_peer_plugin_on_piece_failedSwigExplicitswig_peer_plugin(swigCPtr, this, index);
  }

  public void tick() {
    if (getClass() == swig_peer_plugin.class) libtorrent_jni.swig_peer_plugin_tick(swigCPtr, this); else libtorrent_jni.swig_peer_plugin_tickSwigExplicitswig_peer_plugin(swigCPtr, this);
  }

  public boolean write_request(peer_request r) {
    return (getClass() == swig_peer_plugin.class) ? libtorrent_jni.swig_peer_plugin_write_request(swigCPtr, this, peer_request.getCPtr(r), r) : libtorrent_jni.swig_peer_plugin_write_requestSwigExplicitswig_peer_plugin(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public swig_peer_plugin() {
    this(libtorrent_jni.new_swig_peer_plugin(), true);
    libtorrent_jni.swig_peer_plugin_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
