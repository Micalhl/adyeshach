package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.common.entity.EntityTypes

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
@Deprecated("Outdated but usable")
class AdyPig(v2: ink.ptms.adyeshach.core.entity.EntityInstance):  AdyEntityAgeable(EntityTypes.PIG, v2) {

    fun setSaddle(value: Boolean) {
        setMetadata("hasSaddle", value)
    }

    fun hasSaddle(): Boolean {
        return getMetadata("hasSaddle")
    }
}