package de.dytanic.cloudnetcore.network.packet.out;

import de.dytanic.cloudnet.lib.network.protocol.packet.Packet;
import de.dytanic.cloudnet.lib.network.protocol.packet.PacketRC;
import de.dytanic.cloudnet.lib.server.ServerProcessMeta;
import de.dytanic.cloudnet.lib.utility.document.Document;

/**
 * Created by Tareko on 30.07.2017.
 */
public class PacketOutStartServer extends Packet {
    public PacketOutStartServer(ServerProcessMeta serverProcessMeta) {
        super(PacketRC.CN_CORE + 3, new Document("serverProcess", serverProcessMeta));
    }

}
