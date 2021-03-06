package ca.jahed.rtpoet.rtmodel.rts.protocols

import ca.jahed.rtpoet.rtmodel.rts.RTSystemSignal

object RTTimingProtocol : RTSystemProtocol("Timing") {
    private object Timeout : RTSystemSignal("timeout")

    init {
        inputSignals.add(Timeout)
    }

    fun timeout(): RTSystemSignal {
        return Timeout
    }
}