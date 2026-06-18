package mousemaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WindowsVirtualKeyTest {

    @Test
    void genericAltWithoutExtendedFlagMapsToLeftAlt() {
        assertEquals(Key.leftalt,
                WindowsVirtualKey.keyFromWindowsEvent(WindowsVirtualKey.VK_MENU, 0, 0));
    }

    @Test
    void genericAltWithExtendedFlagMapsToRightAlt() {
        assertEquals(Key.rightalt,
                WindowsVirtualKey.keyFromWindowsEvent(WindowsVirtualKey.VK_MENU, 0, 1));
    }
}
