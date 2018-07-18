import {RdfsClass} from '../../tsonld/RdfsClass';
import {RdfId} from '../../tsonld/RdfId';
import {RdfProperty} from '../../tsonld/RdfsProperty';
import {TransformationRuleDescription} from './TransformationRuleDescription';

@RdfsClass('sp:MoveRuleDescription')
export class MoveRuleDescription extends TransformationRuleDescription {

  @RdfId
  public id: string;

  @RdfProperty('sp:oldRuntimeKey')
  public oldRuntimeKey: string;

  @RdfProperty('sp:newRuntimeKey')
  public newRuntimeKey: string;


  constructor(oldRuntimeKey: string, newRuntimeKey) {
    super();
    this.id = "http://streampipes.org/transformation_rule/" + Math.floor(Math.random() * 10000000) + 1;
    this.oldRuntimeKey = oldRuntimeKey;
    this.newRuntimeKey = newRuntimeKey;
  }

}
