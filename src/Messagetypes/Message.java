package Messagetypes;

import org.simpleframework.xml.Root;

@Root
public class Message {
	
//	<message id="0" timestamp="345354432534">
//		<type>ClientLogin</type>
//	<message>
	
	public enum MessageType {
		ClientLogin, ClientDenied, ClientOpenOverview, 
		ClientCreateLobby, ServerUpdateLobby, ClientJoinLobby, ClientShowLobby,
		StartGame, ServerGiveClientsPosition, ClientShowGame, 
		ClientIsActive, ClientRollDice, ServerShowUpdatedDice,
		ClientAttack, ClientRecieveStars, ClientRecieveHearths, ServerUpdatePlayers,
		ClientGoesToTokyo, CientLeavesTokyo, ServerUpdateTokyo,
		ClientLosesHearth, ClientDies, ClientLeaves, ServerUpdateGamefield,
		ClientSendsChatmessage, ServerUpdateChat
	}
	
	
	
	

}
