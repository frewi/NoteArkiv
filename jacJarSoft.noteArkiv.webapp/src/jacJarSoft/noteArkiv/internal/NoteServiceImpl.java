package jacJarSoft.noteArkiv.internal;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import jacJarSoft.noteArkiv.dao.NoteDao;
import jacJarSoft.noteArkiv.service.NoteService;

public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteDao noteDao;

	@Override
	public Response getNote(long noteId) {
		if (noteId <= 0) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(noteDao.getNote(noteId)).build();
	}

}
