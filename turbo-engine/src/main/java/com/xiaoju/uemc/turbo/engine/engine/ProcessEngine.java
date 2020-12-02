package com.xiaoju.uemc.turbo.engine.engine;


import com.xiaoju.uemc.turbo.engine.result.*;
import com.xiaoju.uemc.turbo.engine.param.*;

/**
 * Created by Stefanie on 2019/11/22.
 */
public interface ProcessEngine {

    CreateFlowResult createFlow(CreateFlowParam createFlowParam);

    UpdateFlowResult updateFlow(UpdateFlowParam updateFlowParam);

    DeployFlowResult deployFlow(DeployFlowParam deployFlowParam);

    FlowModuleResult getFlowModule(GetFlowModuleParam getFlowModuleParam);

    StartProcessResult startProcess(StartProcessParam startProcessParam);

    CommitTaskResult commitTask(CommitTaskParam commitTaskParam);

    RollbackTaskResult rollbackTask(RollbackTaskParam rollbackTaskParam);

    TerminateResult terminateProcess(String flowInstanceId);

    NodeInstanceListResult getHistoryUserTaskList(String flowInstanceId);

    ElementInstanceListResult getHistoryElementList(String flowInstanceId);

    InstanceDataListResult getInstanceData(String flowInstanceId);

    NodeInstanceResult getNodeInstance(String flowInstanceId, String nodeInstanceId);

}

