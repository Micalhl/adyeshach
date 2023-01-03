package ink.ptms.adyeshach.api.event

import ink.ptms.adyeshach.common.entity.EntityInstance
import ink.ptms.adyeshach.common.entity.EntityTypes
import org.bukkit.entity.Player
import taboolib.common.platform.event.SubscribeEvent
import taboolib.platform.type.BukkitProxyEvent

/**
 * @author sky
 * @since 2020-08-14 19:21
 */
@Deprecated("Outdated but usable")
class AdyeshachEntityVisibleEvent(val entity: EntityInstance, val viewer: Player, val visible: Boolean) : BukkitProxyEvent() {

    companion object {

        @SubscribeEvent
        fun legacy(e: ink.ptms.adyeshach.core.event.AdyeshachEntityVisibleEvent) {
            if (!AdyeshachEntityVisibleEvent(EntityTypes.adapt(e.entity) ?: return, e.viewer, e.visible).call()) {
                e.isCancelled = true
            }
        }
    }
}