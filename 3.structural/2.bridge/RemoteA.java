public class RemoteA implements Remote {

    // compose with a device, and delegate all operations to it.
    protected Device device;

    public RemoteA(Device device) {
        this.device = device;
    }

    @Override
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }

    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);

    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);

    }

}
