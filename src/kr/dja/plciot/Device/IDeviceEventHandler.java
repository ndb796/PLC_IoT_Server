package kr.dja.plciot.Device;

import kr.dja.plciot.Device.AbsDevice.AbsDevice;

public interface IDeviceEventHandler
{
	public void deviceEvent(AbsDevice device, String key, String data);
}
