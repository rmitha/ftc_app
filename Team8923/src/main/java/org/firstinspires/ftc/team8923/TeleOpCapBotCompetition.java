package org.firstinspires.ftc.team8923;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * This class contains code for running the CapBot with all driver controls
 */
@TeleOp(name = "TeleOp Competition")
public class TeleOpCapBotCompetition extends MasterTeleOpCapBot
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        initHardware();

        waitForStart();

        while(opModeIsActive())
        {
            driveMecanumTeleOp();

            sendTelemetry();
            idle();
        }
    }
}
