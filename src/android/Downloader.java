package com.bolu.cordova.downloader;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;

public class Downloader extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (action.equals("downloadFile")) {
            	download( args.getString(0) );
    		}
            else {
            }
            return true;
        } catch (JSONException e) {
            return false;
        }
    }
    
    private void download(String url) {
    	Intent intent = new Intent();        
    	intent.setAction("android.intent.action.VIEW");    
    	Uri content_url = Uri.parse(url);   
    	intent.setData(content_url);  
    	this.cordova.getActivity().startActivity(intent);	
    }
}