package com.ajay.FirstProject.service;

import com.ajay.FirstProject.entity.JournalEntry;
import com.ajay.FirstProject.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class JournalEntryService {
@Autowired
    private JournalEntryRepository journalEntryRepository;

public void saveEntry(JournalEntry journalEntry){
    journalEntryRepository.save(journalEntry);

}
public List<JournalEntry> getAll(){
    return journalEntryRepository.findAll();
}
}
