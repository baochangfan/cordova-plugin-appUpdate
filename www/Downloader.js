/*var exec = require('cordova/exec');

var toast = function(){};
toast.prototype.ShowToast = function(smsQuit){
	exec(null, null, "Quit", "showQuit", [smsQuit]);
};
cordova.addConstructor(function(){
	if (cordova.addPlugin) {
		cordova.addPlugin("toast", ToastPlugin);
	}
	else {
		if (!window.plugins) {
			window.plugins = {};
		}
		window.plugins.ToastPlugin = new toast();
	}
});
var showt = new toast();module.exports = showt;*/

var exec = require('cordova/exec');
var cordova = require('cordova');

function Downloader(){};





Downloader.prototype.downloadFile = function(fileUrl) {
    cordova.exec(null, null, "Downloader", "downloadFile", [fileUrl]);
}

module.exports = new Downloader();
	